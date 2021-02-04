package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class forum {

    private String username;

    public String getUsername() {
        return username;
    }

    public forum() {
        username = "John Smith";
    }
}
