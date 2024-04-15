package com.VechileInsurance.Project.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.mapping.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
	import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.VechileInsurance.Project.java.Admin.AdminController;
import com.VechileInsurance.Project.java.DashBoard.DashBoard;
import com.VechileInsurance.Project.java.Insurance.Insurance;
import com.VechileInsurance.Project.java.Insurance.InsuranceController;
import com.VechileInsurance.Project.java.Insurance.InsuranceService;
import com.VechileInsurance.Project.java.Payment.Payment;
import com.VechileInsurance.Project.java.Payment.PaymentController;
import com.VechileInsurance.Project.java.Payment.PaymentService;
	@SpringBootTest
	class VechileApplicationTests {

		@Test
		void contextLoads() {
		}
	public class InsuranceControllerTest {

	    @Mock
	    private InsuranceService insuranceService;

	    @InjectMocks
	    private InsuranceController insuranceController;

	    public InsuranceControllerTest() {
	        MockitoAnnotations.initMocks(this);
	    }

	    @Test
	    public void testProvideInsuranceForNewVehicle() {
	        // Mocking a new insurance request
	        Insurance insuranceRequest = new Insurance(/* constructor parameters */);
	        
	        // Mocking the insurance service to return a response
	        Insurance providedInsurance = new Insurance(/* constructor parameters */);
	        when(insuranceService.provideInsurance(any(Insurance.class))).thenReturn(providedInsurance);
	        
	        // Calling the controller method
	        ResponseEntity<Insurance> responseEntity = insuranceController.provideInsurance(insuranceRequest);
	        
	        // Asserting the response
	        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	        assertEquals(providedInsurance, responseEntity.getBody());
	        
	        // Verifying that the provideInsurance method in insuranceService was called once with the insurance request
	        verify(insuranceService, times(1)).provideInsurance(any(Insurance.class));
	    }
	}
	public class PaymentControllerTest {

	    @Mock
	    private PaymentService paymentService;

	    @InjectMocks
	    private PaymentController paymentController;

	    @BeforeEach
	    public void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testGetAllPayments() {
	        // Mocking the list of payments
	        List<Payment> paymentList = new ArrayList<>();
	        paymentList.add(new Payment(/* constructor parameters */));
	        paymentList.add(new Payment(/* constructor parameters */));
	        when(paymentService.getAllPayments()).thenReturn(paymentList);

	        // Calling the controller method
	        List<Payment> response = paymentController.getAllPayments();

	        // Asserting the response
	        assertEquals(paymentList, response);
	    }

	    @Test
	    public void testGetPaymentById() {
	        // Mocking a payment object
	        Payment payment = new Payment(/* constructor parameters */);
	        when(paymentService.getPaymentById(anyLong())).thenReturn(payment);

	        // Calling the controller method
	        Payment response = paymentController.getPaymentById(1L);

	        // Asserting the response
	        assertEquals(payment, response);
	    }

	    @Test
	    public void testCreatePayment() {
	        // Mocking a payment object
	        Payment payment = new Payment(/* constructor parameters */);
	        when(paymentService.savePayment(any(Payment.class))).thenReturn(payment);

	        // Calling the controller method
	        Payment response = paymentController.createPayment(payment);

	        // Asserting the response
	        assertEquals(payment, response);
	    }

	    @Test
	    public void testDeletePayment() {
	        // Calling the controller method
	        paymentController.deletePayment(1L);

	        // Verifying that the deletePayment method in paymentService was called once with the specified ID
	        verify(paymentService, times(1)).deletePayment(1L);
	    }
	}
	public class AdminControllerTest {

	    @InjectMocks
	    private AdminController adminController;

	    public AdminControllerTest() {
	        MockitoAnnotations.initMocks(this);
	    }

	    @Test
	    public void testAdminDashboard() {
	        // Creating a mock Model object
	        Model model = mock(Model.class);

	        // Calling the controller method
	        String viewName = adminController.adminDashboard();

	        // Asserting the view name returned by the controller
	        assertEquals("admin_dashboard", viewName);
	    }
	}
	public class DashBoardTest {

	    @InjectMocks
	    private DashBoard dashBoard;

	    public DashBoardTest() {
	        MockitoAnnotations.initMocks(this);
	    }

	    @Test
	    public void testAgentDashboard() {
	        String viewName = dashBoard.agentDashboard();
	        assertEquals("agent_dashboard", viewName);
	    }

	    @Test
	    public void testPolicySchemes() {
	        String viewName = dashBoard.policySchemes();
	        assertEquals("policy_schemes", viewName);
	    }

	    @Test
	    public void testCustomerDashboard() {
	        String viewName = dashBoard.customerDashboard();
	        assertEquals("customer_dashboard", viewName);
	    }

	    @Test
	    public void testAdminDashboard() {
	        String viewName = dashBoard.adminDashboard();
	        assertEquals("admin_dashboard", viewName);
	    }
	}
	}