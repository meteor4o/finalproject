package com.softuni.finalproject.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturers")
public class DrugManufacturerEntity extends BaseEntity{
    private String name;

    public DrugManufacturerEntity() {
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public DrugManufacturerEntity setName(String name) {
        this.name = name;
        return this;
    }
}
