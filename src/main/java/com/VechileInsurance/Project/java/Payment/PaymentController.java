package com.VechileInsurance.Project.java.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/payments")
	public class PaymentController {
	    @Autowired
	    private PaymentService paymentService;

	    @GetMapping
	    public List<Payment> getAllPayments() {
	        return paymentService.getAllPayments();
	    }

	    @GetMapping("/{id}")
	    public Payment getPaymentById(@PathVariable Long id) {
	        return paymentService.getPaymentById(id);
	    }

	    @PostMapping
	    public Payment createPayment(@RequestBody Payment payment) {
	        return paymentService.savePayment(payment);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePayment(@PathVariable Long id) {
	        paymentService.deletePayment(id);
	    }
	}


