package com.pruebatecnica.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
     Optional<User> findByEmail(String email);
     boolean existsByEmail(String email);
     boolean existsByEmailAndIdNot(String email, Long id);
     Optional<User> findById(Long id);
     List<User> findAll();
     void deleteById(Long id);
     void delete(User user);
     User save(User user);
}