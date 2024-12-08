package com.example.onboarding.domain.auth.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignRequest {

    private String username;
    private String password;

}
