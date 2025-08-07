package com.uynguyen.jwt_spring_security.user;

import com.uynguyen.jwt_spring_security.user.request.ProfileUpdateRequest;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public void mergeUserInfo(User user, ProfileUpdateRequest request) {
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());
    }
}
