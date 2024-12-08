package com.example.onboarding.domain.auth.dto.response;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class SignupResponse {

    private final String username;
    private final String nickname;
    private final ArrayList<AuthorityDto> authorities;

    public SignupResponse(String username, String nickname, ArrayList<AuthorityDto> authorities) {

        this.username = username;
        this.nickname = nickname;
        this.authorities = authorities;

    }

}
