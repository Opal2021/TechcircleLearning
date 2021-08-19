package day05_ifStatment;

import java.util.Scanner;

public class Homework6OodEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Odd or even
//		Write a program that can check if the given number is odd or even (OddEven)
//		Ex:
//		number = 100;
//		output:
//		100 is even number
//		number = 101
//		output:
//		101 is odd number	
//		
		
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  number");
		int num1 = input.nextInt();
		
		
		
	
	if(num1 % 2 == 0) {
		System.out.println(num1 +" is even number");
	}else if (num1 % 2 == 1) {
		System.out.println(num1 +" is odd number");
	} else{
			
		  System.out.println("Invalid");
		
	  }
	
	
		input.close();
	
	}//end method

}//end class
