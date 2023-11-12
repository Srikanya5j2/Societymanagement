package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.VisitorLog;
import com.springboot.main.service.GateKeeperService;
import com.springboot.main.service.ResidentService;
import com.springboot.main.service.VisitorLogService;

@Controller
@RequestMapping("/visitorlogs")
public class VisitorLogController {
	@Autowired
	private VisitorLogService visitorLogService; 
	@Autowired
	private GateKeeperService gateKeeperService;
	@Autowired
	private ResidentService residentService;
	@PostMapping("/add")
	public VisitorLog insertVisitorLog(@RequestBody VisitorLog visitorLog) {
		visitorLog= visitorLogService.insert(visitorLog);
	    return visitorLog;
	}
}
