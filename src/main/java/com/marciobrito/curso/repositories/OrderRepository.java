package com.marciobrito.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciobrito.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
