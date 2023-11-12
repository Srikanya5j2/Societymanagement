package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.HomeService;

public interface HomeServiceRepository extends JpaRepository<HomeService, Integer> {

}
