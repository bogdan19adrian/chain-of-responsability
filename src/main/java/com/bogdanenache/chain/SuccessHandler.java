package com.bogdanenache.chain;

import com.bogdanenache.resource.Processable;
import com.bogdanenache.resource.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SuccessHandler<T extends Processable> extends AbstractFileProcessor{

    private T processingFileClient;

    public SuccessHandler(T processingFileClient) {
        this.processingFileClient = processingFileClient;
    }

    @Override
    public void setHandler(Processor handler) {

    }

    @Override
    public void process() {
        if(processingFileClient.getStatus().equals(Status.PROCESSING)) {
            log.info("[[ DELIVER IT TO NEXT BUCKET]]");
        }

    }

    @Override
    public void doNext(AbstractFileProcessor abstractFileProcessor) {

    }
}
