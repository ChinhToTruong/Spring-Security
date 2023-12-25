package com.example.demo.entity2.response;

import com.example.demo.entity2.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponse {
    private Long userId;
    private String username;
    private String email;
    public String password;
    private Set<RoleName> roleNames = new HashSet<>();

    public UserInfoResponse(Long id, String username, String email, Set<String> roles) {
        this.userId = id;
        this.username = username;
        this.email = email;
        this.roleNames = roles.stream()
              .map(RoleName::new )
              .collect(Collectors.toSet());
    }
}
