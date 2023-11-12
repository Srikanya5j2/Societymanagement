package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Notice;
import com.springboot.main.repository.NoticeRepository;
@Service
public class NoticeService {
@Autowired
private NoticeRepository noticeRepository;
	public Notice insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeRepository.save(notice);
	}

}
