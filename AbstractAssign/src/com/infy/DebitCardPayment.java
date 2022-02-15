package com.infy;

public class DebitCardPayment extends Payment {
	private static int counter;
	private double discountPercentage;
	
	static {
		counter = 1000;
	}

	public DebitCardPayment(int customerId) {
		super(customerId);
		this.paymentId = "D" + ++counter;
	}

	public double payBill(double amount) {

		if (amount <= 500) {
			this.discountPercentage = 1;
			this.serviceTaxPercentage = 2.5;
		} else if (amount > 500 && amount <= 1000) {
			this.serviceTaxPercentage = 4;
			this.discountPercentage = 2;
		} else {
			this.serviceTaxPercentage = 5;
			this.discountPercentage = 3;
		}

		double bill = amount + amount * (this.serviceTaxPercentage / 100) - amount * (this.discountPercentage / 100);
		return bill;
	}

	public static int getCounter() {
		return DebitCardPayment.counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return this.discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
