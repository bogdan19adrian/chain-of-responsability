package com.bogdanenache.resource;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "key",
        "size",
        "etag",
        "version-id",
        "sequencer"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BucketObject {

    @JsonProperty("key")
    private String key;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("version-id")
    private String versionId;
    @JsonProperty("sequencer")
    private String sequencer;

}