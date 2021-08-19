package day06_SwitchStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String operator = "+";
	
	int num1 = 2;
	
	int num2 = 3;
	
	int total = 0;
		
		
	switch (operator) {
	
	case "+":
		
//		System.out.println("+");
		total = num1+num2;
		
		break;
		
    case "-":
		
//		System.out.println("-");
    	total = num1-num2;
		break;
		
    case "*":
	
//	System.out.println("*");
    	total = num1*num2;
	break;
	
    case "/":
	
//	System.out.println("/");
    	total = num1/num2;
	break;

	default:
		
		System.out.println("Invalid Operator");
		break;
	}	
		
		
		
	//1 + 3 = 4
			System.out.println(num1 + " "+ operator + " "+ num2 + " = "+ total);	
		
		
		
		
		
		
		
	}//end method

}//end class
