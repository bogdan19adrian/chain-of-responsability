package com.bogdanenache.resource;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ProcessingFileClient implements Processable{

    private String bucketName;
    private String fileName;
    private String errorMessage;
    private int rowNum;
    private String incomingFileLocation;
    private String outgoingFileLocation;
    private Status status;
    private String errorDetail;
    private Long recordCount;
    private LocalDateTime receivedDateTime;
    private LocalDateTime deliveredDateTime;

}
