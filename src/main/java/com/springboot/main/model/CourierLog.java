package com.springboot.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourierLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String courierName;
	private LocalDate entryTime;
	private LocalDate exitTime;

	@ManyToOne
	private GateKeeper gateKeeper;
	@ManyToOne
	private Resident resident;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public LocalDate getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDate entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDate getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDate exitTime) {
		this.exitTime = exitTime;
	}

	public GateKeeper getGateKeeper() {
		return gateKeeper;
	}

	public void setGateKeeper(GateKeeper gateKeeper) {
		this.gateKeeper = gateKeeper;
	}

	public Resident getResident() {
		return resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}
}