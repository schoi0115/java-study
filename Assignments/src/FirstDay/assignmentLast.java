package FirstDay;

public class assignmentLast {
	static int countDigit(int account) {
		int count = 0; // => 1 ->2 ->3 ->4
		while (account != 0) {
			account = account / 10; // 100 -> 10 -> 1 -> 0
			++count;
		}
//	        System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int account = 1001;

		// Implement your code here
		int salary = 100000;
		int accountBalance = 2500000;
		String loanType = "House";
		int lanAmountExpected = 30000;
		int emisExpected = 30;

		String numberString = String.valueOf(account);
//			System.out.println(numberString);
		char firstCharacter = numberString.charAt(0);

		if (firstCharacter == 0 || countDigit(account) - 4 != 0) {
			System.out.println(
					"You account should start number 0  or the count must caoint 4 digits numbers - Invalid account number");
		}

		else if (accountBalance > 1000 && salary > 25000 && loanType == "Car") {
			System.out.println("eligibleLoanAmount=500000");
			System.out.println("eligibleEmis=36");
		}

		else if (accountBalance > 1000 && salary > 50000 && loanType == "House") {
			System.out.println("eligibleLoanAmount=6000000");
			System.out.println("eligibleEmis=60");
		} else if (accountBalance > 1000 && salary > 75000 && loanType == "Business") {
			System.out.println("eligibleLoanAmount=75000000");
			System.out.println("eligibleEmis=84");
		} else {
			System.out.println("Invalid - You do not have enought saving, salary, or both");
		}

	}

}
