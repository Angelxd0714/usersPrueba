package com.pruebatecnica.users.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuccessResponse<T> {
    private String message;
  

    public static <T> SuccessResponse<T> of(String message) {
        return new SuccessResponse<>(message);
    }
}
