package com.pruebatecnica.users.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebatecnica.users.dto.request.UserRequest;
import com.pruebatecnica.users.dto.response.UserResponse;
import com.pruebatecnica.users.mapper.UserMapper;
import com.pruebatecnica.users.model.User;
import com.pruebatecnica.users.repository.UserRepository;
import com.pruebatecnica.users.dto.response.SuccessResponse;
import com.pruebatecnica.users.utils.Constantes;

import java.time.LocalDateTime;

@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public SuccessResponse<UserResponse> createUser(UserRequest userRequest) {
        if (userRepository.existsByEmail(userRequest.getEmail())) {
            throw new RuntimeException(Constantes.EMAIL_ALREADY_EXISTS);
        }
        User user = userMapper.toEntity(userRequest);
        User savedUser = userRepository.save(user);
        return SuccessResponse.of(Constantes.USER_CREATED, userMapper.toDto(savedUser));
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(Constantes.USER_NOT_FOUND));
        return userMapper.toDto(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public SuccessResponse<UserResponse> updateUser(Long id, UserRequest userRequest) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(Constantes.USER_NOT_FOUND));
        
        if (userRequest.getName() != null) {
            existingUser.setName(userRequest.getName());
        }
        if (userRequest.getEmail() != null) {
            if (userRepository.existsByEmailAndIdNot(userRequest.getEmail(), id)) {
                throw new RuntimeException(Constantes.EMAIL_ALREADY_EXISTS);
            }
            existingUser.setEmail(userRequest.getEmail());
        }
        
        existingUser.setUpdatedAt(LocalDateTime.now());
        
        User updatedUser = userRepository.save(existingUser);
        return SuccessResponse.of(Constantes.USER_UPDATED, userMapper.toDto(updatedUser));
    }

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException(Constantes.USER_NOT_FOUND);
        }
        userRepository.deleteById(id);
    }
}
