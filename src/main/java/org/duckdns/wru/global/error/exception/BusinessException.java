package org.duckdns.wru.global.error.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final String errorCode;

    public BusinessException(String message,String errorCode ) {
        super(message);
        this.errorCode = errorCode;
    }
}
