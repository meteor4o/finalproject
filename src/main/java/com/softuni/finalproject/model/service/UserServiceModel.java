package com.softuni.finalproject.model.service;

import com.softuni.finalproject.model.entity.RoleEntity;

import java.util.Set;

public class UserServiceModel {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private Set<RoleEntity> roles;

    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public UserServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public UserServiceModel setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
        return this;
    }
}
