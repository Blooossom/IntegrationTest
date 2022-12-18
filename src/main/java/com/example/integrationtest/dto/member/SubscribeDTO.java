package com.example.integrationtest.dto.member;

public class SubscribeDTO {
    private String email;

    public SubscribeDTO(String email) {
        this.email = email;
    }

    public SubscribeDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
