package com.uynguyen.jwt_spring_security.user.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfileUpdateRequest {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
