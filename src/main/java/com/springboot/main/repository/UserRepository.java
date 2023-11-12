package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}