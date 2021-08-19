package day05_ifStatment;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperature = 99;

		boolean sunny = false;

		if (temperature > 90) {

			if (sunny) {

				System.out.println("Beach");
			} else {

				System.out.println("Movie");
			}
		} else {

			if (sunny) {

				System.out.println("Tennis");

			} else {

				System.out.println("Soccer");

			}
		}

	}// end method

}//end class
