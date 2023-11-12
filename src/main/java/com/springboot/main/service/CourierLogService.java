package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.CourierLog;
import com.springboot.main.repository.CourierLogRepository;
@Service
public class CourierLogService {
	@Autowired
	private CourierLogRepository courierLogRepository;
	public CourierLog insert(CourierLog courierLog) {
		// TODO Auto-generated method stub
		return courierLogRepository.save(courierLog);
	}

}
