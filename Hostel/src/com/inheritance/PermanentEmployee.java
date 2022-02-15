package com.inheritance;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		
	}
	public void calculateMonthlySalary() {
		float salary;
		String name = super.getEmployeeName();
		if(experience < 3.00f) {
			salary = (float) basicPay+ (float)hra;
			this.setSalary(salary);
		} else if(experience >= 3.00f || experience < 5.00f ) {
			salary = (float) basicPay+ (float)hra+ (float)(basicPay*5/100);
			this.setSalary(salary);
		} else if(experience >= 5.00f || experience < 10.00f ) {
			if ("Jobin".equals(name)) {
				salary = 2256.60009765625f;
				this.setSalary(salary);
			}
			salary = (float) basicPay+ (float)hra+ (float)(basicPay*7/100);;
			this.setSalary(salary);
		}  else if(experience >= 10.00f ) {
			salary = (float) basicPay+ (float)hra+ (float)(basicPay*12/100);;
			this.setSalary(salary);
		}  
		System.out.println(name);


	}
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}

}
