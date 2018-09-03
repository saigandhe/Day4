package com.capgemini.bankaccount.domain;

public class PresidentSalary extends EmployeeDetails {
	
	private static int basic;
	private static int medical = 250;
	private double Kilometers;
	private double TourAllowance;
	private static int TelephoneAllowance=2000;
	public PresidentSalary() {
		super();
	
	}
	public PresidentSalary(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}
	public PresidentSalary(double kilometers, double tourAllowance) {
		super();
		Kilometers = kilometers;
		TourAllowance = tourAllowance;
	}
	public static int getBasic() {
		return basic;
	}
	public static void setBasic(int basic) {
		PresidentSalary.basic = basic;
	}
	public static int getMedical() {
		return medical;
	}
	public static void setMedical(int medical) {
		PresidentSalary.medical = medical;
	}
	public double getKilometers() {
		return Kilometers;
	}
	public void setKilometers(double kilometers) {
		Kilometers = kilometers;
	}
	public double getTourAllowance() {
		return TourAllowance;
	}
	public void setTourAllowance(double tourAllowance) {
		TourAllowance = tourAllowance;
	}
	public static int getTelephoneAllowance() {
		return TelephoneAllowance;
	}
	public static void setTelephoneAllowance(int telephoneAllowance) {
		TelephoneAllowance = telephoneAllowance;
	}
	
	
	public double calTourAllowance() {
		return 8*Kilometers;
	}
	
public static double calsalary(int income) {
		
		EmployeeDetails ref = new EmployeeDetails();
		PresidentSalary ps = new PresidentSalary();
		
		double netSalary = ref.calSalary(basic,medical);
		netSalary += ps.Kilometers+ps.TourAllowance+ps.TelephoneAllowance;
		System.out.println("NetSalary of President:"+netSalary);
		
		return netSalary;
	
	
	
	
}
}
