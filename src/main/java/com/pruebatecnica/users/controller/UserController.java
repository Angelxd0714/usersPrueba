package com.pruebatecnica.users.controller;

import com.pruebatecnica.users.dto.response.SuccessResponse;
import com.pruebatecnica.users.dto.response.UserResponse;
import com.pruebatecnica.users.dto.request.UserRequest;
import com.pruebatecnica.users.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
     private final IUserService userService;

     public UserController(IUserService userService) {
         this.userService = userService;
     }
     
     @PostMapping
     @Operation(summary = "Create user")
     public SuccessResponse<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest) {
         return userService.createUser(userRequest);
     }
     
     @GetMapping
     @Operation(summary = "Get all users")
     public List<UserResponse> getAllUsers() {
         return userService.getAllUsers();
     }
     
     @GetMapping("/{id}")
     @Operation(summary = "Get user by id")
     public UserResponse getUserById(@PathVariable Long id) {
         return userService.getUserById(id);
     }
     
     @PutMapping("/{id}")
     @Operation(summary = "Update user")
 public SuccessResponse<UserResponse> updateUser(@PathVariable Long id, @Valid @RequestBody UserRequest userRequest) {
         return userService.updateUser(id, userRequest);
     }
     
     @DeleteMapping("/{id}")
     @Operation(summary = "Delete user")
     public void deleteUser(@PathVariable Long id) {
         userService.deleteUser(id);
     }
}