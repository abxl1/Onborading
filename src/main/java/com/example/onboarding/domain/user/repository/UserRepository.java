package com.example.onboarding.domain.user.repository;

import com.example.onboarding.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
