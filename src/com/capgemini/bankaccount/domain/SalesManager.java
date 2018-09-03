package com.capgemini.bankaccount.domain;

public class SalesManager extends EmployeeDetails {
	
	private static int basic;
	private static int medical = 250;
	private double PetrolAllowance;
	private double FoodAllowance;
	private double OtherAllowance;
	public SalesManager() {
		super();
		
	}
	public SalesManager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}
	public SalesManager(double petrolAllowance, double foodAllowance, double otherAllowance) {
		super();
		PetrolAllowance = petrolAllowance;
		FoodAllowance = foodAllowance;
		OtherAllowance = otherAllowance;
	}
	public double getPetrolAllowance() {
		return PetrolAllowance;
	}
	public void setPetrolAllowance(double petrolAllowance) {
		PetrolAllowance = petrolAllowance;
	}
	public double getFoodAllowance() {
		return FoodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		FoodAllowance = foodAllowance;
	}
	public double getOtherAllowance() {
		return OtherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		OtherAllowance = otherAllowance;
	}
	 
	public double calPetrolAllowance(int basic) {
		return 0.8*basic;
	}
	
	public double calFoodAllowance(int basic) {
		return 0.13*basic;
	}
	
	public double calOtherAllowance(int basic) {
		return 0.3*basic;
	}
	
	public static double calsalary(int income) {
		
		EmployeeDetails ref = new EmployeeDetails();
		SalesManager sm = new SalesManager();
		
		double netSalary = ref.calSalary(basic,medical);
		netSalary += sm.calOtherAllowance(basic)+sm.calPetrolAllowance(basic)+sm.calFoodAllowance(basic);
		System.out.println("NetSalary of Sales Manager:"+netSalary);
		return netSalary;
		
		
	}
		
	}
	
	


