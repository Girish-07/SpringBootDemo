package com.zoro.ecommerce_mgt.repository;

import com.zoro.ecommerce_mgt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}