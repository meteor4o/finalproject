package com.softuni.finalproject.model.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductServiceModel {
    private Long id;
    private String name;
    private BigDecimal price;
    private LocalDate expireDate;

    public Long getId() {
        return id;
    }

    public ProductServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public ProductServiceModel setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
        return this;
    }
}
