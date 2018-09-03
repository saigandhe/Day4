package com.capgemini.bankaccount.domain;

public class EmployeeDetails {
	public static int calSalary;
	private int employeeId;
     private String employeeName;
     private double HRA;
     private double PF;
     private double basicSalary;
     private double grossSalary;
     private double netSalary;
     private double medical;
     private double PT = 200;
	
	public EmployeeDetails() {
		super();
		
	}

	  public EmployeeDetails(int employeeId, String employeeName, double basicSalary, double medical )
	     {
	    	this.employeeId = employeeId;
	 		this.employeeName = employeeName;
	 		this.basicSalary = basicSalary;
	 		this.medical = medical;
	}
	  public double calSalary (int Salary, int medical2)
		{
			setHRA(0.5*basicSalary);
			PF = 0.12*basicSalary;
			grossSalary = getHRA()+basicSalary+medical;
			netSalary = grossSalary-(PF+PT);
			return Salary;
		}
	     public void displayEmployeeDetails() {
	    	 System.out.println("employeeId : " + employeeId + "\nemployee name: " + employeeName +  
	 				"\nbasicSalary: " + basicSalary + "\nmedical: " + medical);
	     }

		public double getHRA() {
			return HRA;
		}

		public void setHRA(double hRA) {
			HRA = hRA;
		}
	 
	}

	

	
		
	
	
	

