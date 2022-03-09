package com.softuni.finalproject.model.entity;

import com.softuni.finalproject.model.entity.enums.LevelEnum;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity extends BaseEntity {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private LevelEnum level;
    private String phoneNumber;

    public CustomerEntity() {
    }

    @Column(nullable = false)
    public String getFullName() {
        return fullName;
    }

    public CustomerEntity setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Column(nullable = false)
    public String getUsername() {
        return username;
    }

    public CustomerEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public CustomerEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public CustomerEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public CustomerEntity setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    @Column(nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
