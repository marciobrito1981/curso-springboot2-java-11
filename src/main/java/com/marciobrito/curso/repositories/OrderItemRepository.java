package com.marciobrito.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciobrito.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
