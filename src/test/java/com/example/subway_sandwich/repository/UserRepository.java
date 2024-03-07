package com.example.subway_sandwich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.subway_sandwich.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    org.springframework.boot.autoconfigure.security.SecurityProperties.User findByUsername(String username);
}

