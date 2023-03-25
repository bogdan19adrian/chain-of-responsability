package com.bogdanenache.chain;

public interface Processor {

    public void setHandler(Processor handler);

    public void process();

}
