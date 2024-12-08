package com.example.onboarding.domain.auth.controller;

import com.example.onboarding.domain.auth.dto.request.SignRequest;
import com.example.onboarding.domain.auth.dto.request.SignupRequest;
import com.example.onboarding.domain.auth.dto.response.SignResponse;
import com.example.onboarding.domain.auth.dto.response.SignupResponse;
import com.example.onboarding.domain.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    /**
     * 회원가입
     *
     * @param signupRequest 회원가입 시 필요한 body ( username, password, nickname )
     * @return responseDTO ( username, nickname, authorities<> )
     */
    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> signup(@Valid @RequestBody SignupRequest signupRequest) {

        SignupResponse response = authService.signup(signupRequest);
        return ResponseEntity.ok(response);

    }

    /**
     * 로그인
     *
     * @param signRequest 로그인 시 필요한 body ( username, password )
     * @return responseDTO ( bearerToken )
     */
    @PostMapping("/sign")
    public ResponseEntity<SignResponse> sign(@Valid @RequestBody SignRequest signRequest) {

        String token = authService.sign(signRequest);
        SignResponse response = new SignResponse(token);
        return ResponseEntity.ok(response);

    }

}
