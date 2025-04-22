package com.cricbuzz.authservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private Object result;
    private boolean isSuccess = true;
    private String message;
}
