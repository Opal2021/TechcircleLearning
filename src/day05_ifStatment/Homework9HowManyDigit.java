package day05_ifStatment;

import java.util.Scanner;

public class Homework9HowManyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		How many digits?
//				Given a number(long) determine and print how many digits it has.
//				Condition: The number has to be between 1 and 100000, 
//		        if it is not print "Invalid number"
//				Ex: 124 --> 3 digits
//				13213 --> 5 digits
//				883218 --> Invalid number
//				23 --> 2 digits
//		
//		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		long num = input.nextLong();
		
		//long num = 100000;
		
		if(num >=0 && num <= 100000) {
		
		        if(num >= 0 && num <= 9 ) {
		        	System.out.println("1 Digit");
		        }
		        if (num >= 10 && num <= 99) {
		        	System.out.println("2 Digits");
		        }
		
		        if (num >= 100 && num <= 999) {
		        	System.out.println("3 Digits");
		        }
		        if (num >= 1000 && num <= 1999) {
		        	System.out.println("4 Digits");
		        }
		        if (num >= 10000 && num <= 19999) {
		        	System.out.println("5 Digits");
		        }
		
		        if (num == 100000) {
		        	System.out.println("6 Digits");
		        }
		
		}else
			
			System.out.println("Invalid number");
		
		input.close();
	}//end method

}//end class
