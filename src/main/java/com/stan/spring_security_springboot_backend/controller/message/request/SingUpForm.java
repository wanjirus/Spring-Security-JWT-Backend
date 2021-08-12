package com.stan.spring_security_springboot_backend.controller.message.request;
import lombok.Data;

import java.util.Set;

import javax.validation.constraints.*;
@Data
public class SingUpForm {

   // @Size(min = 3, max = 50)
    private String name;

    @NotNull
    @Size(min = 3, max = 50)
    private String username;


    @Size(max = 60)
    private String email;

    private Set role;

    @NotNull
    @Size(min = 6, max = 40)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set getRole() {
        return this.role;
    }

    public void setRole(Set role) {
        this.role = role;
    }
}
