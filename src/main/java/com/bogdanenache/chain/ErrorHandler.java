package com.bogdanenache.chain;

import com.bogdanenache.resource.Processable;
import com.bogdanenache.resource.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorHandler<T extends Processable> extends AbstractFileProcessor{

    private T processingFileClient;

    public ErrorHandler(T processingFileClient) {
        this.processingFileClient = processingFileClient;
    }

    @Override
    public void setHandler(Processor handler) {

    }

    @Override
    public void process() {
        if(processingFileClient.getStatus().equals(Status.ERROR)) {
            log.info("[[ERROR]]");
        }

    }

    @Override
    public void doNext(AbstractFileProcessor abstractFileProcessor) {

    }
}
