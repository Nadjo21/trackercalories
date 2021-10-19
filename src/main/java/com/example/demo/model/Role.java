package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_ADMIN,  ROLE_READER;

    @Override
    public String getAuthority() {
        return name();
    }
}
