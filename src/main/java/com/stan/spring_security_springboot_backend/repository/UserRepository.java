package com.stan.spring_security_springboot_backend.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository {
    Optional findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}