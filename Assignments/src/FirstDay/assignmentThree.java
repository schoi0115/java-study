package FirstDay;

public class assignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 6;
		int num3 = 7;
		if (num1 == 7 || num2 == 7 || num3 == 7) {
			if (num1 == 7) {
				System.out.println(num2 * num3);
			}
			if (num2 == 7) {
				System.out.println(num3);
			}
			if (num3 == 7) {
				System.out.println("-1");
			}
		} else {
			System.out.println(num1 * num2 * num3);
		}
	}

}
