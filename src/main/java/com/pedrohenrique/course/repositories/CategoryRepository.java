package com.pedrohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
