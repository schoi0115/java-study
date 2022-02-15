package com.quiz;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(7);

		int val = stack.size() - 1;
		int value1 = 1;

		while (val > 0) {
			int topElement = stack.pop();
			Deque<Integer> tempStack = new ArrayDeque<Integer>();
			int value2 = 1;

			while (value2 <= value1) {
				int element = stack.pop();
				tempStack.push(element + topElement);
				value2 += 1;
			}
			while (tempStack.peek() != null) {
				stack.push(tempStack.pop());
			}
			stack.push(topElement);
			value1 += 1;
			val -= 1;
		}
		System.out.println(stack);
	}

}
