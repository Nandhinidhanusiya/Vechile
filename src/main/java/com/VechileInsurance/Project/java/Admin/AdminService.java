package com.VechileInsurance.Project.java.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class AdminService {
	    @Autowired
	    private AdminRepository adminRepository;

	    public Admin findByUsername(String username) {
	        return adminRepository.findByUsername(username);
	    }
	}



