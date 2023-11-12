package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.GateKeeper;
import com.springboot.main.repository.GateKeeperRepository;

	@Service
	public class GateKeeperService {
	@Autowired
	private GateKeeperRepository gateKeeperRepository;
	public GateKeeper insert(GateKeeper gatekeeper) {
		return gateKeeperRepository.save(gatekeeper);
	}
	}