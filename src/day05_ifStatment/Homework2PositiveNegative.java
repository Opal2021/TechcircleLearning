package day05_ifStatment;

import java.util.Scanner;

public class Homework2PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find the number is positive or negative.  
//		Write a program to find the number is positive or negative. 
//		/*
//		input:
//		number = 200
//		output:
//		200 is positive number
//		input:
//		number= -200
//		-200 is negative number
//		*/
//		
//		
		System.out.println("Type the number");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		
		//double number = -1;
		
		String Printthis = "";
	
		
			if(number < 0) {
				Printthis =(number) + "is Negative number ";
		
			} 
			if(number > 0) {
				Printthis =(number) + "is Positive number ";
			}
			else
				Printthis ="0 is not Positive and Negative number";
				
			System.out.println(Printthis);
		
		
		input.close();
		
		}//end method

}//end class
