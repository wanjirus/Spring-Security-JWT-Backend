package com.stan.spring_security_springboot_backend.repository;
import java.util.Optional;

import com.stan.spring_security_springboot_backend.entity.Role;
import com.stan.spring_security_springboot_backend.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Optional<Role> findByName(RoleName roleName);
}