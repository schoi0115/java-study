package com.infy;

public class CreditCardPayment extends Payment {

	private static int counter;
	
	static {
		counter = 1000;
	}


	public CreditCardPayment(int customerId) {
		super(customerId);
		this.paymentId = "C" + ++counter;
	}

	public double payBill(double amount) {
		// determine service tax
		if (amount <= 500) {
			this.serviceTaxPercentage = 3;
		} else if (amount > 500 && amount <= 1000) {
			this.serviceTaxPercentage = 5;
		} else {
			this.serviceTaxPercentage = 6;
		}
		// calculate bill
		double bill = amount + amount * (this.serviceTaxPercentage / 100);
		return bill;
	}

	public static int getCounter() {
		return CreditCardPayment.counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

}
