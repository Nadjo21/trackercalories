package com.example.demo.controller;

public class JWTDto {


    private final String idToken;

    public JWTDto(String idToken) {
        this.idToken = idToken;
    }

    public String getIdToken() {
        return idToken;
    }

}
