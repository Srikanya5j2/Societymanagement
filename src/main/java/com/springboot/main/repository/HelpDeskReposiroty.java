package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.HelpDesk;

public interface HelpDeskReposiroty extends JpaRepository<HelpDesk, Integer> {

}
