package day24_Method;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 3;
		
		int num2 = 5;
		
		subtraction(3,8);
		
		mulyiply(6,8);
		
		divide(8,9);
		
		//Call another Method from another class
		
		MethodIntro.printFlag(); 
		
		
	}//end Method

	
	public static void subtraction (int num1, int num2) {
		
		System.out.println(num1-num2);
		}
		
		public static void mulyiply (int num1, int num2) {
			
			System.out.println(num1*num2);
			}
			
			public static void divide (int num1, int num2) {
				
				System.out.println(num1/num2);
		
		
	}
	
	
}//end class
