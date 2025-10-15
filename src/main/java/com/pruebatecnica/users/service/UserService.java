package com.pruebatecnica.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebatecnica.users.dto.UserRequest;
import com.pruebatecnica.users.dto.UserResponse;

@Service
public class UserService implements IUserService{

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public UserResponse getUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public List<UserResponse> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
