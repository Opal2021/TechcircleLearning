package day10_NestLoop;

import java.util.Scanner;

public class Homework_infiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		 Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//			hint: you need an infinite loop
//		
		
		
		Scanner input = new Scanner(System.in);
		//int i = 1;
		
		int sum = 0;
		
		for(;;) {
			
			System.out.println("Enter your number");
			
			
			int userInput = input.nextInt();
			
			
			if (userInput >= 0) {
				
				sum = sum + userInput;
				
			}else
				
			break;
		}
		
		System.out.println(sum);
		
		input.close();
		
		
//Task3	
		
//		3, Write a program that calculates the sum of numbers entered 
//		by the user until user enters a negative number.
//		hint: you need an infinite loop
		
//		Scanner scan = new Scanner(System.in);
//		
//		int sum = 0 ;
//		
//		int num = 0;
//		
//		
//		do {
//			
//			System.out.println("Plase enter a number");
//			
//			num = scan.nextInt();
//			
//			sum += num;
//			
//		}while(num > -1);
//		
//		
//		System.out.println(sum);
//		scan.close();
//		
		
		
	}//end method

}//end class
