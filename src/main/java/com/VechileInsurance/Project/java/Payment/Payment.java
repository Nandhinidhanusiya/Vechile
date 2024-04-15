package com.VechileInsurance.Project.java.Payment;
import java.util.Date;

//import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
	@Entity
	public class Payment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String transactionId;
	    private double amount;
	    private Date paymentDate;
	    // Other payment details
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Date getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(Date paymentDate) {
			this.paymentDate = paymentDate;
		}
		@Override
		public String toString() {
			return "Payment [id=" + id + ", transactionId=" + transactionId + ", amount=" + amount + ", paymentDate="
					+ paymentDate + "]";
		}
		

	    // Getters and setters
	    // Constructor
	}


