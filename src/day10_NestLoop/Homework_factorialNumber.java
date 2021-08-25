package day10_NestLoop;

import java.util.Scanner;

public class Homework_factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		, Write a program that can return the factorial number of any given number
//				Ex:
//					input: 5
//					output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int userInput = input.nextInt();
		
		
		int sum = 1;
		
		for(int i = userInput; i >= 1 ;i-- ) {
			
			sum = sum * i;
				
			}
			
			System.out.println(sum);
			input.close();
		
		}//end method

}//end class
