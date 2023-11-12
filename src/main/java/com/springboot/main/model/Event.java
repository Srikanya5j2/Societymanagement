package com.springboot.main.model;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Content;
	private LocalDate date;
	private String location;
	private String participantList;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getParticipantList() {
		return participantList;
	}

	public void setParticipantList(String participantList) {
		this.participantList = participantList;
	}

}