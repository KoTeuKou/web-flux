package com.flux.webflux.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Message {
    @Id
    private Long id;
    private String data;

    public Message(String data) {
        this.data = data;
    }

}