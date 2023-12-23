package com.pedrohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
