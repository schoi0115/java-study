package FirstDay;

public class DayTwoThird {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 18853;
		int saveNumber = inputNumber;
		int sumOfDigits = 0;
		int temp = 0;

		do {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		} while (inputNumber > 0);

		System.out.println(sumOfDigits);
//		System.out.println(inputNumber);
		int possible = saveNumber % sumOfDigits;
		if (possible == 0) {
			System.out.println(saveNumber + " " + "is divisible");
		} else {
			System.out.println(saveNumber + " " + "is not divisible");
		}
		

		

	}

}
