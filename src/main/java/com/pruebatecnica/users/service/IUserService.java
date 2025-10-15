package com.pruebatecnica.users.service;

import com.pruebatecnica.users.dto.request.UserRequest;
import com.pruebatecnica.users.dto.response.SuccessResponse;
import com.pruebatecnica.users.dto.response.UserResponse;
import java.util.List;

public interface IUserService {
    SuccessResponse<UserResponse> createUser(UserRequest userRequest);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    SuccessResponse<UserResponse> updateUser(Long id, UserRequest userRequest);
    void deleteUser(Long id);
}
