package com.VechileInsurance.Project.java.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminController {
    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin_dashboard"; // Thymeleaf template for admin dashboard
    }

    // Add more mappings for other admin functionalities
}


