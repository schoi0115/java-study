package Dowhile;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int number = scanner.nextInt();
		while(true) {
			System.out.println("input: ");
			input = scanner.next().toLowerCase();
			if (number%5 == 0 && number%3 ==0)
				System.out.println("Fizz");

		}

	}

}
