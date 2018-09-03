package com.capgemini.bankaccount.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.bankaccount.domain.EmployeeDetails;
import com.capgemini.bankaccount.domain.PresidentSalary;
import com.capgemini.bankaccount.domain.SalesManager;

class EmployeeDetailsTest {

	SalesManager manager;
	
	EmployeeDetails employeedetails;
	PresidentSalary presidentSalary;

	@BeforeEach
	void setUp() {
		employeedetails=new EmployeeDetails(1234,"naveena",15000.0,2500);
	}
	
	@Test
	void testcalEmployeeSalary() {
		assertEquals(2500,employeedetails.calSalary(2500,250),0.02);
	}
	@Test
	void testcalSalesManager() {
		manager=new SalesManager(1234,"swathi",15000,2500);
	
		assertEquals(3500,manager.calSalary(3500,250),0.02);
	}
	void testcalculatePresidentSalary() {
	presidentSalary=new PresidentSalary(1234,"naveena",15000,2500);
	assertEquals(3500.00,presidentSalary.calSalary(4500,250),0.03);
	}

		
	}