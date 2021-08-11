package com.stan.spring_security_springboot_backend.repository;
import java.util.Optional;

import com.stan.spring_security_springboot_backend.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository {

    Optional findByName(RoleName roleName);
}