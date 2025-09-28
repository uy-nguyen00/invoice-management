package com.uynguyen.invoice_management.auth.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequest {

    @NotBlank(message = "VALIDATION.AUTHENTICATION.EMAIL.NOT_BLANK")
    @Email(message = "VALIDATION.AUTHENTICATION.EMAIL.FORMAT")
    @Schema(example = "example@mail.com")
    private String email;

    @NotBlank(message = "VALIDATION.AUTHENTICATION.PASSWORD.NOT_BLANK")
    @Schema(example = "<PASSWORD>")
    private String password;
}
