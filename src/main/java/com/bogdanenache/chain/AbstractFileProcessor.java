package com.bogdanenache.chain;

public abstract class AbstractFileProcessor implements Processor {

    public AbstractFileProcessor nextProcessor;

    public abstract void doNext(AbstractFileProcessor abstractFileProcessor);


}
