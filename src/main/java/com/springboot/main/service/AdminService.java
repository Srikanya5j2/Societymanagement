package com.springboot.main.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.exception.InvalidIdException;
import com.springboot.main.model.Admin;
import com.springboot.main.repository.AdminRepository;
@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	public Admin insert(Admin admin) {
		return adminRepository.save(admin);
	}
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
	public Admin getOne(int id) throws InvalidIdException {
		Optional<Admin> optional =  adminRepository.findById(id);
		if(!optional.isPresent()){
			throw new InvalidIdException("admin ID Invalid");
		}
		return optional.get();
	}
	
	
}