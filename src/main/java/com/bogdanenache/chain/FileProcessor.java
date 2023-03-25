package com.bogdanenache.chain;

import com.bogdanenache.chain.handlers.ProcessFile;
import com.bogdanenache.chain.handlers.FileRetriever;
import com.bogdanenache.chain.validators.Validator;
import com.bogdanenache.resource.Processable;

public class FileProcessor<T extends Processable> {

    private T processable;
    public FileProcessor<T> validate(Validator validator) {
        validator.process();
        return this;
    }

    public FileProcessor<T> processFile(ProcessFile<T> processFile) {
        processFile.process();
        return this;
    }

    public FileProcessor<T> readFileFromS3(FileRetriever fileRetriever){
        fileRetriever.process();
        return this;
    }

    public void errorHandler(ErrorHandler fileRetriever){
        fileRetriever.process();
    }
}
