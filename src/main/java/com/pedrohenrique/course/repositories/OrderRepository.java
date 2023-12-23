package com.pedrohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
