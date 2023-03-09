package com.example.yorbit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yorbit.model.Product;
import com.example.yorbit.repository.ProductRepository;
import com.myoffice.model.employee.Role;

@RestController
@RequestMapping("/product")
@CrossOrigin()
public class ProductController {
	
	@Autowired
	private ProductRepository pr;
	
	@GetMapping
	public List<Product> getList(){
		return pr.findAll();
	}
	
	@GetMapping("/findById/{productId}")
	public Optional<Product> findById(@PathVariable(value="productId")long id){
		Optional<Product> pro = pr.findById(id);
		
		if(pro.isPresent()) {
			return pro;
		}
		
		return null;
	}

}
