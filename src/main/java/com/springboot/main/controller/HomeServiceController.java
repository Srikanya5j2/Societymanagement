package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.HomeService;
import com.springboot.main.model.Notice;
import com.springboot.main.service.HomeServiceService;
import com.springboot.main.service.ResidentService;

@Controller
@RequestMapping("/homeservices")
public class HomeServiceController {
	@Autowired
	private ResidentService residentService;
	@Autowired
	private HomeServiceService homeServiceService ;
	@PostMapping("/add")
	public HomeService insertHomeService(@RequestBody HomeService homeService) {
		homeService=homeServiceService.insert(homeService);
		return homeService;

}
}
