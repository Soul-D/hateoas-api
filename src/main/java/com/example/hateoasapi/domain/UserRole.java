package com.example.hateoasapi.domain;


import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority {

    private String authority;

    public UserRole() {}

    public UserRole(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority() {
        this.authority = authority;
    }
}
