package com.uynguyen.jwt_spring_security.config;

import com.uynguyen.jwt_spring_security.user.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class ApplicationAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null
                || !authentication.isAuthenticated()
                || authentication instanceof AnonymousAuthenticationToken
        ) {
            return Optional.empty();
        }

        final User user = (User) authentication.getPrincipal();
        return Optional.ofNullable(user.getId());
    }
}
