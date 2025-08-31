package com.uynguyen.jwt_spring_security.auth.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequest {

    // validation later
    private String email;
    private String password;
}
