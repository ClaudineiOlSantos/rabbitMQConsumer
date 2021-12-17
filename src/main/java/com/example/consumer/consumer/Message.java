package com.example.consumer.consumer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.io.Serializable;

@With
@Value
@JsonDeserialize(builder = Message.JacksonBuilder.class)
@Builder(builderClassName = "JacksonBuilder")
public class Message implements Serializable {
    String message;

    @JsonPOJOBuilder(withPrefix = "")
    public static class JacksonBuilder{}
}
