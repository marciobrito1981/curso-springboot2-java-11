package com.marciobrito.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciobrito.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
