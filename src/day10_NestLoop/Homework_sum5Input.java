package day10_NestLoop;

import java.util.Scanner;

public class Homework_sum5Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1, write a program that can calculate the sum of 5 user entered inputs
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		int sum = 0 ;
		
		for(int i = 1 ; i <= 5 ; i++) {
			//System.out.println(i);
			System.out.println("Enter your number");
		
		    int userInput = input.nextInt();
			
			sum = sum + userInput;
			
			}
		
		System.out.println(sum);
		
		input.close();
			
		}//end Method

}//end Class
