package com.greppiluciano.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greppiluciano.products.entities.Product;


public interface ProductsDAO extends JpaRepository<Product, Long>{

	
	
}
