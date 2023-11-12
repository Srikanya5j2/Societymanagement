package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.HelpDesk;
import com.springboot.main.model.Notice;
import com.springboot.main.service.HelpDeskService;
import com.springboot.main.service.ResidentService;

@Controller
@RequestMapping("/Helpdesk")
public class HelpDeskController {
@Autowired
private ResidentService residentService;
@Autowired 
private HelpDeskService helpDeskService;

@PostMapping("/add")
public HelpDesk insertHelpDesk(@RequestBody HelpDesk helpDesk) {
	helpDesk=helpDeskService.insert(helpDesk);
	return helpDesk;
}
}
