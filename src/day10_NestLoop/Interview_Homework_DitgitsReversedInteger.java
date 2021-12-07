 package day10_NestLoop;

import java.util.Scanner;

public class Interview_Homework_DitgitsReversedInteger {

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
	
	//String convertToString  = ""+userInput;
	
	//for(int i = 0 ; i >= comvertToString.length()-1 ;i++) {
	
	for(int i = comvertToString.length()-1 ; i >= 0 ;i--) {
		
		
		System.out.print(comvertToString.charAt(i));
		
	}
	
	int convertToInt = Integer.parseInt(comvertToString);
	
	System.out.println("");
	
	
		input.close();
		
		
		// Method 2 Reverse number
		
	    int num = 12345
				
				;
		int reversenum =0;
		
		 while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10; //2
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);
		
	
		
	}//end method

}//end class
