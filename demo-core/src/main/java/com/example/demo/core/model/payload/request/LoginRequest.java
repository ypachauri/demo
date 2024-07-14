package com.example.demo.core.model.payload.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginRequest {

    private String username;

    private String password;
}
