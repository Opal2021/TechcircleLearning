package day25_MethodParamsAndMethodOverloading;

public class Task1_CheckInteger {

	
	//1. create a function that can check if the given integer is positive, negative or zero
	
	
	public static void main (String[]args) {
		
		System.out.println(checkInteger(0));
		
		System.out.println(checkInteger(-1));
		
		System.out.println(checkInteger(1));
		
		
	}//end method
		
		
		
	
	
	
public static String checkInteger (int num) {
		
		String msg = "";
		
		if(num > 0) {
			
			msg = "Positive";
			
		}else if (num < 0) {
			
			msg = "Negative";
		
		}else if ( num == 0) {
			
			msg = "Zero";
		}
		
		return msg;
		
	
	
}	
	
	
}	//end class
	
	
	
	
	
	
	
	
	


