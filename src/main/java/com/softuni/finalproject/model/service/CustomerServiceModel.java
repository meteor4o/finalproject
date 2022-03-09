package com.softuni.finalproject.model.service;

import com.softuni.finalproject.model.entity.enums.LevelEnum;

public class CustomerServiceModel {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private LevelEnum level;
    private String phoneNumber;

    public CustomerServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public CustomerServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public CustomerServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CustomerServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CustomerServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public CustomerServiceModel setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
