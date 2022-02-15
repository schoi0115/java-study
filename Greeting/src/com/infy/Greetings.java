package com.infy;

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = 6;
		n = arr[arr[n] / 2];
		System.out.println(n);
		System.out.println(arr[n] / 2);
		
		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
		int total = 1;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 1; j < inputArray[i].length - 1; j++) {
				total *= inputArray[i][j];
			}
		}
		System.out.println("Result = " + total);
		
		int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
		int total1 = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (i == j)
					continue;
				total1 += numbers[i][j];
			}
		}
		System.out.println("Result = " + total1);

	}
//    public static int calculateSumOfEvenNumbers(int[] numbers){
//        //Implement your code here and change the return value accordingly
//        int sum = 0;
//        for(int i = 0; i < numbers.length; i++){
//            if (numbers[i] % 2 == 0){
//                sum += numbers[i];
//            }
//        }
//        return sum;
//    }
//    
//	public static void main(String[] args) {
//		int[] numbers = {68,79,86,99,23,2,41,100};
//		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
//	}

}
