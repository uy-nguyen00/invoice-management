package com.uynguyen.jwt_spring_security.user.impl;

import com.uynguyen.jwt_spring_security.user.UserMapper;
import com.uynguyen.jwt_spring_security.user.UserRepository;
import com.uynguyen.jwt_spring_security.user.UserService;
import com.uynguyen.jwt_spring_security.user.request.ChangePasswordRequest;
import com.uynguyen.jwt_spring_security.user.request.ProfileUpdateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public void updateProfileInfo(ProfileUpdateRequest request, String userId) {

    }

    @Override
    public void changePassword(ChangePasswordRequest request, String userId) {

    }

    @Override
    public void deactivateAccount(String userId) {

    }

    @Override
    public void reactivateAccount(String userId) {

    }

    @Override
    public void deleteAccount(String userId) {

    }
}
