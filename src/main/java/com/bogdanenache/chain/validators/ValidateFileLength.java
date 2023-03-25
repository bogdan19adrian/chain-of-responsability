package com.bogdanenache.chain.validators;

import com.bogdanenache.chain.Processor;
import com.bogdanenache.resource.Processable;
import com.bogdanenache.resource.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidateFileLength<T extends Processable> implements Validator {
    private T processable;
    private Processor handler;
    private String handlerName;

    public ValidateFileLength(T processable) {
        this.processable = processable;
    }

    @Override
    public void setHandler(Processor handler) {
        this.handler = handler;
    }

    @Override
    public void process() {
        if (processable.getStatus().equals(Status.ERROR)) {

        } else {
            log.info("Validate file length");
        }
    }


}
