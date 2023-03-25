package com.bogdanenache.resource;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "id",
        "detail-type",
        "source",
        "account",
        "time",
        "region",
        "resources",
        "detail"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventBridgeNotification {

    @JsonProperty("version")
    private String version;
    @JsonProperty("id")
    private String id;
    @JsonProperty("detail-type")
    private String detailType;
    @JsonProperty("source")
    private String source;
    @JsonProperty("account")
    private String account;
    @JsonProperty("time")
    private String time;
    @JsonProperty("region")
    private String region;
    @JsonProperty("resources")
    private List<String> resources;
    @JsonProperty("detail")
    private Detail detail;

}