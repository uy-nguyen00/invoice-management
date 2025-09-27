package com.uynguyen.jwt_spring_security.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND("USER_NOT_FOUND", "User not found with id %s", HttpStatus.NOT_FOUND),

    PASSWORDS_MISMATCH("PASSWORD_MISMATCH", "Passwords do not match", HttpStatus.BAD_REQUEST),

    CHANGE_PASSWORD_MISMATCH("CHANGE_PASSWORD_MISMATCH", "New password and confirmed password must be the same", HttpStatus.BAD_REQUEST),

    INVALID_OLD_PASSWORD("INVALID_OLD_PASSWORD", "Old password is invalid", HttpStatus.BAD_REQUEST),

    ACCOUNT_ALREADY_DEACTIVATED("ACCOUNT_ALREADY_DEACTIVATED", "Account already deactivated", HttpStatus.BAD_REQUEST),

    ACCOUNT_ALREADY_ACTIVATED("ACCOUNT_ALREADY_ACTIVATED", "Account already activated", HttpStatus.BAD_REQUEST),

    INVALID_JWT_TOKEN("INVALID_JWT_TOKEN", "Invalid JWT token", HttpStatus.BAD_REQUEST),

    EMAIL_ALREADY_EXISTS("EMAIL_ALREADY_EXISTS", "Email already exists", HttpStatus.CONFLICT),

    PHONE_ALREADY_EXISTS("PHONE_ALREADY_EXISTS", "Phone number already exists", HttpStatus.CONFLICT),

    ;

    private final String code;
    private final String defaultMessage;
    private final HttpStatus status;
}
