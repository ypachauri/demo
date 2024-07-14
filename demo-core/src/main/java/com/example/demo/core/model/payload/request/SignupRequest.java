package com.example.demo.core.model.payload.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
public class SignupRequest {

    private String username;

    private String email;

    private Set<String> role;

    private String password;
}
