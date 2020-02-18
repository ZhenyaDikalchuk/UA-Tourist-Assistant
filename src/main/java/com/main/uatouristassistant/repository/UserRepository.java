package com.main.uatouristassistant.repository;

import com.main.uatouristassistant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Long id);
}