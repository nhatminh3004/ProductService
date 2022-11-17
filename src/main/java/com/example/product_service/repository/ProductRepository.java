package com.example.product_service.repository;

import com.example.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import javax.transaction.Transactional;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Modifying
    @Transactional
    @Query(value = "select * from products where hightlight=true ", nativeQuery = true)
    public List<Product> getProductHightlight();
}
