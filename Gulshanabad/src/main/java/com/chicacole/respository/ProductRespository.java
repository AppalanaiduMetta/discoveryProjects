package com.chicacole.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chicacole.model.Product;

public interface ProductRespository extends JpaRepository<Product, Long> {
}
