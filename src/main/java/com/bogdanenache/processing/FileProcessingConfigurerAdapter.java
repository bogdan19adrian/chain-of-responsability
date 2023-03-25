package com.bogdanenache.processing;

import com.bogdanenache.resource.Processable;
import org.springframework.stereotype.Service;

@Service
public interface FileProcessingConfigurerAdapter {

    void process(String bucketName, String fileName, Processable processable);
}
