package com.stan.spring_security_springboot_backend.entity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
@Data
@Entity
@Table(name="users", uniqueConstraints = {@UniqueConstraint(columnNames={
        "username"
}),
        @UniqueConstraint(columnNames = {"email"})})

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(min=3, max = 50)
    private String name;
    @NotNull
    @Size(min=3, max = 50)
    private String username;

    @NaturalId
    @Size(max = 50)
    private String email;


    @NotNull
    @Size(min=6, max = 100)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name ="role_id"))
    private  Set <Role> roles=new HashSet<>();
    //private Set roles = new HashSet<>();
    public User() {}

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}