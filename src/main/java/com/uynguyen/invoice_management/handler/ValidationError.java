package com.uynguyen.invoice_management.handler;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ValidationError {

    private String field;
    private String code;
    private String message;
}
