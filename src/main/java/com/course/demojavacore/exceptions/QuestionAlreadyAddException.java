package com.course.demojavacore.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionAlreadyAddException extends RuntimeException {
    public QuestionAlreadyAddException() {
    }

    public QuestionAlreadyAddException(String message) {
        super(message);
    }

    public QuestionAlreadyAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyAddException(Throwable cause) {
        super(cause);
    }

    public QuestionAlreadyAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
