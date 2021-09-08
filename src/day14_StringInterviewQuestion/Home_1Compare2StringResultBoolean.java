package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Home_1Compare2StringResultBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compare 2 strings. Store the result in a boolean variable.
				//If the boolean variable is true, print a statement stating
				//the strings are the same. If false, print a statement stating
				//they're not the same	
		
		System.out.println("Enter first String");
		
		Scanner scan  = new Scanner(System.in);
		
		String input1 = scan.next();
		
		System.out.println(" Enter second String");
		
		String input2 = scan.next();
		
		boolean result = input1.equals(input2);
		
		if(result) {
			
			
			System.out.println(" String are the same");
			
			
		}else
			
			System.out.println("THey are not the same");
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
