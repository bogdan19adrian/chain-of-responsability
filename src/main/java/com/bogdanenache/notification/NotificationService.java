package com.bogdanenache.notification;

import com.bogdanenache.processing.FileProcessingOrchestrator;
import com.bogdanenache.resource.EventBridgeNotification;
import com.bogdanenache.resource.ProcessingFileClient;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class NotificationService {

    private final FileProcessingOrchestrator fileProcessingOrchestrator;

    @SqsListener(value = "#{'${cloud.aws.sqs.listener.file-processing-queue}'.split(',')}",
            deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveNotification(EventBridgeNotification eventBridgeNotification) {
        final ProcessingFileClient processable = new ProcessingFileClient();

        final String bucketName = eventBridgeNotification.getDetail().getBucket().getName();
        final String fileName = eventBridgeNotification.getDetail().getObject().getKey();
        log.info("Notification received with details{} , {}",
                bucketName,
                fileName);
        processable.setBucketName("test");

        fileProcessingOrchestrator.process(bucketName, fileName, processable);
    }


}
