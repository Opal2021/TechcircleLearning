package day05_ifStatment;

import java.util.Scanner;

public class Homework5Compare2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Compare two numbers using scanner
//		write a program that can print out the max 
//		 number between two numbers using scanner
//		Ex:
//		num1 = 20;
//		num2 = 30;
//		output:
//		30 is the max number
//		num1 = 20;
//		num2 = 20;
//		output:both numbers are equal
//		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();
		
//		double num1 = 20;
//		double num2 = 12.2;
//	
	if(num1 > num2) {
		System.out.println(num1 +" is the max number");
	}else if (num2 > num1) {
		System.out.println(num2 +" is the max number");
	} if(num1 == num2) {
			
		  System.out.println("Both numbers are equal");
		
	  }
		  			
	input.close();	
		
	
		
	}//end method

}//end class
