package com.codejam.userservice.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BUSINESS_CONSTANTS {

    USER_NOT_FOUND(1001),
    USER_CRED_MISMATCH(1002),
    USER_ALREADY_EXISTS(1003);

    private int value;
}
