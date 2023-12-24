package com.pedrohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
