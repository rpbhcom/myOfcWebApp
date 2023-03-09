package com.example.myOfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myOfc.model.Cart;
import com.example.myOfc.model.CartPk;

@Repository
public interface CartRepository extends JpaRepository<Cart,CartPk>{

}
