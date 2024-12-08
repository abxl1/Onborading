package com.example.onboarding.common.exception;

import com.example.onboarding.common.enums.ErrorCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private ErrorCode errorCode;

    // 예외명(대문자+'_') + (HttpStatus.오류코드, "메세지")
    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}
