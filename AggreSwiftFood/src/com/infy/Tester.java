package com.infy;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1 = new Food();
		food1.setFoodName("Burger");
		
		Food food2 = new Food();
		food2.setFoodName("Pizza");
		
		Food[] orderedFoods = {food1, food2};
		
		Order order = new Order(orderedFoods);
		
		for(Food food: orderedFoods) {
			System.out.println(food.getFoodName());
		
		}
		
		System.out.println(order.getStatus() + " " );
		

	}

}
