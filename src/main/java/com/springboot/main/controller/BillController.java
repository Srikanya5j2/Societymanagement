package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.Bill;
import com.springboot.main.service.BillService;
import com.springboot.main.service.ResidentService;

@Controller
@RequestMapping("/bills")
public class BillController {
	@Autowired
	private ResidentService residentService;
	@Autowired 
	private BillService billService;
@PostMapping("/add")
public Bill insertBill(Bill bill) {
	bill = billService.insert(bill);
	return bill;
}
}
