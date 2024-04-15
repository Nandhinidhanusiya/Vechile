package com.VechileInsurance.Project.java.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
	public class InsuranceService {
	    
	    @Autowired
	    private InsuranceRepository insuranceRepository;

	    // Method to provide insurance for a new car or change policy for an existing customer
	    public Insurance provideInsurance(Insurance insurance) {
	        // Implement logic to provide insurance (e.g., save insurance details)
	        return insuranceRepository.save(insurance);
	    }

	    // Method to retrieve insurance by ID
	    public Insurance getInsuranceById(Long id) {
	        return insuranceRepository.findById(id).orElse(null);
	    }
	    // Method to retrieve all insurances
	    public List<Insurance> getAllInsurances() {
	        return insuranceRepository.findAll();
	    }
	    // Method to update insurance details
	    public Insurance updateInsurance(Insurance insurance) {
	        // Implement logic to update insurance details
	        return insuranceRepository.save(insurance);
	    }

	    // Method to delete insurance
	    public void deleteInsurance(Long id) {
	        // Implement logic to delete insurance
	        insuranceRepository.deleteById(id);
	    }
	}



