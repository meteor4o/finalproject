package com.softuni.finalproject.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class ProductEntity extends BaseEntity{
    private String name;
    private BigDecimal price;
    private LocalDate expireDate;

    public ProductEntity() {
    }

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public ProductEntity setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
        return this;
    }
}
