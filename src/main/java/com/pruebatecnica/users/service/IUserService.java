package com.pruebatecnica.users.service;

import com.pruebatecnica.users.dto.request.UserRequest;
import com.pruebatecnica.users.dto.response.UserResponse;
import java.util.List;

public interface IUserService {
    UserResponse createUser(UserRequest userRequest);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    UserResponse updateUser(Long id, UserRequest userRequest);
    void deleteUser(Long id);
}
