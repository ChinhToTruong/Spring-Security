package com.example.demo.repository;

import com.example.demo.constant2.ERole;
import com.example.demo.entity2.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleName, Long> {
    Optional<RoleName> findByRoleName(ERole name);
}
