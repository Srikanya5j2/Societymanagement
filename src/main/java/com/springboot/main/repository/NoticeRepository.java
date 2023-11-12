package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Integer>{

}
