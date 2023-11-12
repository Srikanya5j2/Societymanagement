package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.CourierLog;
import com.springboot.main.model.Event;
import com.springboot.main.service.CourierLogService;
import com.springboot.main.service.GateKeeperService;
import com.springboot.main.service.ResidentService;

@Controller
@RequestMapping("/courierlogs")
public class CourierLogController {
	
@Autowired
private CourierLogService courierLogService; 
@Autowired
private GateKeeperService gateKeeperService;
@Autowired
private ResidentService residentService;
@PostMapping("/add")
public CourierLog insertCourierLog(@RequestBody CourierLog courierLog) {
	courierLog= courierLogService.insert(courierLog);
    return courierLog;
}
}