package com.example.myOfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myOfc.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
