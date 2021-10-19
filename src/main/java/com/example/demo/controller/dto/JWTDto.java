package com.example.demo.controller.dto;

public class JWTDto {


    private final String idToken;

    public JWTDto(String idToken) {
        this.idToken = idToken;
    }

    public String getIdToken() {
        return idToken;
    }

}
