package com.infy;

public class Order {
	private static int orderIdCounter;
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;

	static {
		orderIdCounter = 101;
	}
	public Order() {
		this.status = "Ordered";
	}

	public Order(Food[] orderedFoods) {
		this.orderId = orderIdCounter++;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}

	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter - 100;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	// other methods

	public double calculateTotalPrice(String paymentMode) {
		double foodPrice = 0;
		double finalPrice = 0;
		float serviceCharge = 0f;
		for (Food food : orderedFoods) {
			foodPrice += food.getUnitPrice() * 1;
		}
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card")) {
			serviceCharge = 2.0f;
		} else if (paymentMode.equals("PayPal")) {
			serviceCharge = 2.9f;
		}
		finalPrice = foodPrice + foodPrice * (serviceCharge / 100);
		this.setTotalPrice(finalPrice);
		return finalPrice;
	}

	public static int getOrderIdCounter() {
		return orderIdCounter;
	}

	public static void setOrderIdCounter(int orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
