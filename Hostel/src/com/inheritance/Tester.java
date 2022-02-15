package com.inheritance;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        PermanentEmployee permanentEmployee = new PermanentEmployee(112112, "Jobin", 1980.0, 138.0, 5.01f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);

		ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
		contractEmployee.calculateSalary();
		System.out.println("Hi " + contractEmployee.getEmployeeName() + ", your salary is $"
				+ Math.round(contractEmployee.getSalary() * 100) / 100.0);

	}

}
