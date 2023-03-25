package com.bogdanenache.chain.handlers;

import com.bogdanenache.chain.Processor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileRetriever implements Processor {

    private Processor handler;
    private String handlerName;

    @Override
    public void setHandler(Processor handler) {
        this.handler = handler;
    }

    @Override
    public void process() {
        log.info("Fetch file from s3");
    }

}
