package com.bogdanenache.processing;

import com.bogdanenache.chain.ErrorHandler;
import com.bogdanenache.chain.FileProcessor;
import com.bogdanenache.chain.SuccessHandler;
import com.bogdanenache.chain.handlers.*;
import com.bogdanenache.chain.validators.ValidateFileHeaderAndFooter;
import com.bogdanenache.chain.validators.ValidateFileLength;
import com.bogdanenache.chain.validators.ValidateFileName;
import com.bogdanenache.chain.validators.ValidateFileRows;
import com.bogdanenache.resource.Processable;
import com.bogdanenache.resource.ProcessingFileClient;

public class FileProcessingOrchestrator implements FileProcessingConfigurerAdapter {

    @Override
    public void process(String bucketName, String fileName, Processable processable) {

       final FileProcessor<ProcessingFileClient> fileProcessor = new FileProcessor<>();
        fileProcessor
                .readFileFromS3(new FileRetriever())
                .validate(new ValidateFileName<>(processable))
                .validate(new ValidateFileHeaderAndFooter<>(processable))
                .validate(new ValidateFileLength<>(processable))
                .validate(new ValidateFileRows<>(processable))
                .processFile(new ProcessFile(processable))
                .successHandler(new SuccessHandler<>(processable))
                .errorHandler(new ErrorHandler<>(processable));
    }
}
