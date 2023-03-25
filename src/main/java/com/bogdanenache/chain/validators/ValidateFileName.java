package com.bogdanenache.chain.validators;

import com.bogdanenache.chain.Processor;
import com.bogdanenache.resource.Processable;
import com.bogdanenache.resource.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidateFileName<T extends Processable> implements Validator {
    private T processingFileClient;
    private Processor handler;
    private String handlerName;

    public ValidateFileName(T processingFileClient) {
        this.processingFileClient = processingFileClient;
    }

    @Override
    public void setHandler(Processor handler) {
        this.handler = handler;
    }

    @Override
    public void process() {
        log.info("Validate fileName");
        if(processingFileClient.getFileName().equals("fileName")) {
            log.info("[[ ERROR -> fileNameNotUnique ]]");
            processingFileClient.setStatus(Status.ERROR);

        } else {
            processingFileClient.setStatus(Status.PROCESSING);
        }
    }

}
