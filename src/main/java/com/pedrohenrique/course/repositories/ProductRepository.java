package com.pedrohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
