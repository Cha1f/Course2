package com.course.demojavacore.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongAmountException extends RuntimeException {
    public WrongAmountException() {
    }

    public WrongAmountException(String message) {
        super(message);
    }

    public WrongAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongAmountException(Throwable cause) {
        super(cause);
    }

    public WrongAmountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
