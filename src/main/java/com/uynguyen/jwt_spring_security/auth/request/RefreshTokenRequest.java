package com.uynguyen.jwt_spring_security.auth.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshTokenRequest {

    private String refreshToken;
}
