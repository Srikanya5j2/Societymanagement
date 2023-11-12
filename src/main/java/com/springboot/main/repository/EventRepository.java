package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}
