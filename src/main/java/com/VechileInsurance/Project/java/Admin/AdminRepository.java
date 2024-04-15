package com.VechileInsurance.Project.java.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import com.VechileInsurance.Project.java.Insurance.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}

