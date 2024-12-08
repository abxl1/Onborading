package com.example.onboarding.common.dto;

import com.example.onboarding.domain.user.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

public class AuthUser {

    private final UserRole role;

    public AuthUser(UserRole role) {
        this.role = role;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

}
