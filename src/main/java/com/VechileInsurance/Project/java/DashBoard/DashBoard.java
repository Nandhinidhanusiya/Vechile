package com.VechileInsurance.Project.java.DashBoard;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	@Controller
	public class DashBoard {
	 @GetMapping("/agent")
	 public String agentDashboard() {
	 return "agent_dashboard"; // Assuming you have a Thymeleaf template named agent_dashboard.html
		 }
	  @GetMapping("/policy-schemes")
	  public String policySchemes() {
	 return "policy_schemes"; // Thymeleaf template for policy schemes
		 }
	  @GetMapping("/customer")
		 public String customerDashboard() {
		   return "customer_dashboard"; // Thymeleaf template for customer dashboard
		    }

		    @GetMapping("/admin")
		    public String adminDashboard() {
		        return "admin_dashboard"; // Thymeleaf template for admin dashboard
		    }
		}


