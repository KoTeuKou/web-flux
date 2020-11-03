package com.flux.webflux.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private Long id;
    private String username;
    private String password;

}
