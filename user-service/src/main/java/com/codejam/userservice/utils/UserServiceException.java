package com.codejam.userservice.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserServiceException extends RuntimeException {
    public UserServiceException(String exceptionMessage, int userNotFound) {
        super(exceptionMessage);
    }
}
