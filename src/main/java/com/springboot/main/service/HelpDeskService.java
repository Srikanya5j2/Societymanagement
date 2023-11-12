package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.HelpDesk;
import com.springboot.main.repository.HelpDeskReposiroty;

@Service
public class HelpDeskService {
@Autowired
private  HelpDeskReposiroty helpDeskRepository;

public  HelpDesk insert(HelpDesk helpDesk) {
	// TODO Auto-generated method stub
	return helpDeskRepository.save(helpDesk);
}
}
