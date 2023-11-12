package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.main.model.GateKeeper;




public interface GateKeeperRepository extends JpaRepository <GateKeeper, Integer> {
}