package com.softuni.finalproject.repository;

import com.softuni.finalproject.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByName(String productName);

    Optional<ProductEntity> findAllByExpireDate(LocalDate expireDate);
}
