package com.example.mailSender.repository;

import com.example.mailSender.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepositoy extends JpaRepository<Product,Long> {
    Product findByIdAndIsActiveTrue(Long id);
    List<Product> findAllByIsActiveTrue();
}
