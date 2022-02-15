package FirstDay;

public class assignmentTwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 4;
		int c = 4;
		int discriminant = ((b * b) - (4 * a * c));
		int x = ((-b + discriminant) / (2 * a));
		int equation = ((a * x * x) + (b * x) + c);
		if (discriminant < 0) {
			System.out.println("The equation has no real root");
		} else {
			System.out.println("The root is " + x);
		}


	}

}
