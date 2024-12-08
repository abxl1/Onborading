package com.example.onboarding.domain.auth.service;

import com.example.onboarding.domain.auth.dto.request.SignRequest;
import com.example.onboarding.domain.auth.dto.request.SignupRequest;
import com.example.onboarding.domain.auth.dto.response.SignupResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AuthService {

    public SignupResponse signup(SignupRequest signupRequest) {
        return null;
    }

    public String sign(@Valid SignRequest signRequest) {
        return "";
    }

}
