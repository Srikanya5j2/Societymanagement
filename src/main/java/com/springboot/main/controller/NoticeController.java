package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.Notice;
import com.springboot.main.service.NoticeService;


@Controller
@RequestMapping("/notices")
public class NoticeController {
@Autowired
private NoticeService noticeService;
@PostMapping("/add")
public Notice insertNotice(@RequestBody Notice notice) {
	notice=noticeService.insert(notice);
	return notice;
}

}
