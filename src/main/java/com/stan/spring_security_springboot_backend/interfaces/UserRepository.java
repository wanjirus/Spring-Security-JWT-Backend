package com.stan.spring_security_springboot_backend.interfaces;

import com.stan.spring_security_springboot_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
User findByUsername(String username);
}
