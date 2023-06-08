package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds03.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
