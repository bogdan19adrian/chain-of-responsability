package com.bogdanenache.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "bucket",
        "object",
        "request-id",
        "requester",
        "source-ip-address",
        "reason"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detail {

    @JsonProperty("version")
    private String version;
    @JsonProperty("bucket")
    private Bucket bucket;
    @JsonProperty("object")
    private BucketObject object;
    @JsonProperty("request-id")
    private String requestId;
    @JsonProperty("requester")
    private String requester;
    @JsonProperty("source-ip-address")
    private String sourceIpAddress;
    @JsonProperty("reason")
    private String reason;

}