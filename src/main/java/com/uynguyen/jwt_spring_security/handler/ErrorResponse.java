package com.uynguyen.jwt_spring_security.handler;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ErrorResponse {

    private String message;
    private String code;
    private List<ValidationError> validationErrorList;
}
