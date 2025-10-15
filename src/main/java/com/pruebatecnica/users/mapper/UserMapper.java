package com.pruebatecnica.users.mapper;

import com.pruebatecnica.users.dto.request.UserRequest;
import com.pruebatecnica.users.dto.response.UserResponse;
import com.pruebatecnica.users.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    
    public User toEntity(UserRequest request) {
        if (request == null) {
            return null;
        }
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        // Note: The User class doesn't have a password field in the model we can see
        // If you need to set a password, you'll need to add the field to the User class first
        return user;
    }

    public UserResponse toDto(User entity) {
        if (entity == null) {
            return null;
        }
        return UserResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
