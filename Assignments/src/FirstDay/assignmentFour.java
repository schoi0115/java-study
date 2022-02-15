package FirstDay;

public class assignmentFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "N";

		int quantity = 2;
		int distance = 3;
		int priceV = 12;
		int priceN = 15;
		int reminDistance = 3 + ((distance - 6) * 2);

		if (type == "N") {
			if (distance <= 3) {
				System.out.println(quantity * priceN);
			}
			if (distance <= 3 && distance >= 6) {
				System.out.println(quantity * priceN + 1);
			}
			if (distance > 6) {
				System.out.println(quantity * priceN + (reminDistance));
			}
		}
		if (type == "V") {
			if (distance <= 3) {
				System.out.println(quantity * priceV);
			}
			if (distance <= 3 && distance >= 6) {
				System.out.println(quantity * priceV + 1);
			}
			if (distance > 6) {
				System.out.println(quantity * priceV + (reminDistance));
			}

		}

	}

}
