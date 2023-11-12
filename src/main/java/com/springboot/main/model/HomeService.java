package com.springboot.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class HomeService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String homeServiceName;
	private int contact;
	private String mailService;

	@ManyToOne
	private Resident resident;

	public Resident getResident() {
		return resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHomeServiceName() {
		return homeServiceName;
	}

	public void setHomeServiceName(String homeServiceName) {
		this.homeServiceName = homeServiceName;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getmailService() {
		return mailService;
	}

	public void setServiceMail(String mailService) {
		this.mailService = mailService;
	}

}