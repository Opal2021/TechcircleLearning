package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Homework_Last3letterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Task3	
//		3- write a program that asks user to enter a string.
//        if the string is empty, print: string is empty
//        if the string has more than 3 characters, print the last three characters
//        if the string has less than or equal 3 characters, print the string itself
		
		
		
		String userInput = "";
		
		//System.out.println(userInput.length());
		
		
		if( userInput.length() > 3) {
			
			System.out.print(userInput.charAt(userInput.length()-3));
			System.out.print(userInput.charAt(userInput.length()-2));
			System.out.print(userInput.charAt(userInput.length()-1));
		
		
		} if(userInput.length()> 0 && userInput.length() <= 3) {
			
			System.out.println(userInput);
			
		}else
	
			System.out.println("String is empty");
	
	
		
	}//

}//
