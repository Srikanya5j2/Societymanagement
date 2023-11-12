package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.main.model.Resident;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {

}