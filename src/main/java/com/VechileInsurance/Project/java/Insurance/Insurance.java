package com.VechileInsurance.Project.java.Insurance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import org.springframework.data.annotation.Id;
@Entity
	public class Insurance {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String insuranceProvider;
	    private String policyNumber;
	    	    // Other fields and getters/setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getInsuranceProvider() {
			return insuranceProvider;
		}
		public void setInsuranceProvider(String insuranceProvider) {
			this.insuranceProvider = insuranceProvider;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
		@Override
		public String toString() {
			return "Insurance [id=" + id + ", insuranceProvider=" + insuranceProvider + ", policyNumber=" + policyNumber
					+ "]";
		}
	}


