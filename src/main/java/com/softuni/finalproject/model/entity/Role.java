package com.softuni.finalproject.model.entity;

import com.softuni.finalproject.model.entity.enums.RoleNameEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    private RoleNameEnum role;

    @Enumerated(EnumType.STRING)
    public RoleNameEnum getRole() {
        return role;
    }

    public Role setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}
