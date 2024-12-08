package com.example.onboarding.common.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    USER_ROLE_NOT_FOUND(HttpStatus.NOT_FOUND, "대상을 찾지 못했습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "대상을 찾지 못했습니다.");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.message = message;
    }

}
