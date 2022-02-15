package com.infy;

public class ChickenAndRabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 3;
		int legs = 11;
		for (int x = 1; x <= heads; x++) {		
			for (int y = 1; y <= heads; y++) {
				if (x + y == heads && 2 * x + 4 * y == legs) {
					System.out.println("Chickens=" + x);
					System.out.println("Rabbits=" + y);
				} else {
				
						System.out.println("One of them lost a leg or head");
						break;


				}
			} 
		}



		
	}

}
