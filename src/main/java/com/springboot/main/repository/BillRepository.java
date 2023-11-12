package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
