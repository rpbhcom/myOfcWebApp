package com.example.yorbit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yorbit.model.Cart;
import com.example.yorbit.model.CartPk;

@Repository
public interface CartRepository extends JpaRepository<Cart,CartPk>{

}
