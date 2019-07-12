package com.chicacole.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chicacole.model.Product;
import com.chicacole.respository.ProductRespository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class ProductService {
	
	@Autowired
    private ProductRespository productRespository;

    public List<Product> findAll() {
        return productRespository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRespository.findById(id);
    }

    public Product save(Product stock) {
        return productRespository.save(stock);
    }

    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }
}
