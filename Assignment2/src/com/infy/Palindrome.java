package com.infy;

public class Palindrome {

	public static void main(String[] args) {

		String str = "1331";
		String reverseStr = "";

		int strLength = str.length();
		System.out.println(strLength);

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
			System.out.println(str.charAt(i));
//		

			
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str.toLowerCase());
			System.out.println(reverseStr.toLowerCase());
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
