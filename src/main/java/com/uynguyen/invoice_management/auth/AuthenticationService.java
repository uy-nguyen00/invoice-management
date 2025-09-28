package com.uynguyen.invoice_management.auth;

import com.uynguyen.invoice_management.auth.request.AuthenticationRequest;
import com.uynguyen.invoice_management.auth.request.RefreshTokenRequest;
import com.uynguyen.invoice_management.auth.request.RegistrationRequest;
import com.uynguyen.invoice_management.auth.response.AuthenticationResponse;

public interface AuthenticationService {

    void register(RegistrationRequest request);

    AuthenticationResponse login(AuthenticationRequest request);

    AuthenticationResponse refreshToken(RefreshTokenRequest request);
}
