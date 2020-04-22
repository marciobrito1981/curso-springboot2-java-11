package com.marciobrito.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciobrito.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
