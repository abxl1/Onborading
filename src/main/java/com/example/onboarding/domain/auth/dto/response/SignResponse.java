package com.example.onboarding.domain.auth.dto.response;

import lombok.Getter;

@Getter
public class SignResponse {

    private final String token;

    public SignResponse(String token) {
        this.token = token;
    }

}
