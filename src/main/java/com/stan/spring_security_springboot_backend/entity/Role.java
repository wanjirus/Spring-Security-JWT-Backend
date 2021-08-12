package com.stan.spring_security_springboot_backend.entity;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;


////@ManyToMany(fetch = FetchType.LAZY, cascade = {
////        CascadeType.PERSIST,
////        CascadeType.MERGE
//},
//        mappedBy = "roles")
//private Set<User> users = new HashSet<>();


    public Role() {}

    public Role(RoleName name) {
            this.name = name;
        }

        public Long getId () {
            return id;
        }

        public void setId (Long id){
            this.id = id;
        }

        public RoleName getName() {
            return name;
        }

        public void setName (RoleName name){
            this.name = name;
        }
    }
