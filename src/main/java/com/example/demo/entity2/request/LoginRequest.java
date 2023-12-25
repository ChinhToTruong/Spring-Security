package com.example.demo.entity2.request;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private Long id;
    private String username;
    private String email;
    private String password;
    private List<String> roles;
}
