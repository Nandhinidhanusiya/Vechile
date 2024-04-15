package com.VechileInsurance.Project.java.Insurance;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	@RequestMapping("/api/insurances")
	public class InsuranceController {
	    @Autowired
	    private InsuranceService insuranceService;
	    @PostMapping("/provide")
	    public ResponseEntity<Insurance> provideInsurance(@RequestBody Insurance insurance) {
	        Insurance providedInsurance = insuranceService.provideInsurance(insurance);
	        return ResponseEntity.ok(providedInsurance);
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Insurance> getInsuranceById(@PathVariable Long id) {
	        Insurance insurance = insuranceService.getInsuranceById(id);
	        if (insurance == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(insurance);
	    }

	    @GetMapping
	    public List<Insurance> getAllInsurances() {
	        return insuranceService.getAllInsurances();
	    }  

	    @PutMapping("/update")
	    public ResponseEntity<Insurance> updateInsurance(@RequestBody Insurance insurance) {
	        Insurance updatedInsurance = insuranceService.updateInsurance(insurance);
	        return ResponseEntity.ok(updatedInsurance);
	    }
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteInsurance(@PathVariable Long id) {
	        insuranceService.deleteInsurance(id);
	        return ResponseEntity.noContent().build();
	    }
	}


