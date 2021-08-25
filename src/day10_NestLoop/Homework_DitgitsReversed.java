package day10_NestLoop;

import java.util.Scanner;

public class Homework_DitgitsReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		4, Write a program that asks the user to input an integer and 
//		then outputs the number with the digits reversed. 
//		   For example, 
//		if the input is 34567, the output should be 76543.	
//		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int userInput = input.nextInt();
		
	String comvertToString = String.valueOf(userInput);
	
	//for(int i = 0 ; i >= comvertToString.length()-1 ;i++) {
	
	for(int i = comvertToString.length()-1 ; i >= 0 ;i--) {
		
		System.out.print(comvertToString.charAt(i));
		
	}
	
		input.close();
		
		
	}//end method

}//end class
