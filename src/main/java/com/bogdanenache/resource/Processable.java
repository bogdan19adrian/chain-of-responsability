package com.bogdanenache.resource;

public interface Processable {

    String getFileName();

    String getBucketName();

    Status getStatus();

    void setStatus(Status status);
}
