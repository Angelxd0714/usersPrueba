package com.pruebatecnica.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}