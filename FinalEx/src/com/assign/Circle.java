package com.assign;

public class Circle {
	private final double PI = 3.14;
	private double diameter;
	private double circumference;
	private double area;
	
	public Circle(double diameter){
		this.diameter = diameter;
	}
	
	public void calculateCircumference() {
		this.circumference = 2 * (diameter/2) * PI;
		
	
	}
	
	public void calculateArea() {
		area = PI * ((diameter/2)*(diameter/2));

	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPI() {
		return PI;
	}
	

}
