package day07_loop;

import java.util.Scanner;

public class Park_whilwLoop_DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 while loop - will print upon a condition whereas do while loop will print at least one 
//			it dose not matter the condition true or false.
		// For Loop - You know exactly how many time you run.
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter your password: ");
//		String userInput = input.nextLine();
//
//		String pass = "admin123";
//
//		int count = 1 ;
//		while (!userInput.equalsIgnoreCase(pass) && count < 3 ) {
//		System.out.println("Invalid Keep Trying");
//		userInput = input.nextLine();
//		count ++ ;
//		}
//
//		System.out.println("You're done!");
//		input.close();
//
//		
//		2SD TRY
		
		
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i + "Java");
//			i++;
//		}
//		
//		3RD TRY
		
		
		
//		int i   = 1;
//		int sum = 0;
//		
//		while (i <= 10) {
//			
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			//System.out.println(i);
//			//sum = sum + i;
//			i++;
//		}
//		//System.out.println("Total is " + sum);
	
		
		int i = 0;
		Scanner input = new Scanner(System.in);

		String passWord = "dog" ;
		
		do {
		     System.out.println("Enter password: ");
		     String userInput = input.nextLine();
		       if (!userInput.equalsIgnoreCase(passWord)){
		           System.out.println("Try again!");
		       }else
		          break;

		       i++;
		}
		while (i < 3);

		        if (i == 3 ) {
		            System.out.println("Over attemps");
		        }else
		            System.out.println("Correct Password!");

		input.close();
		
	}//END METHOD

}//end class
