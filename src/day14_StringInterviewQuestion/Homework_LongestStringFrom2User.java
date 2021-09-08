package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Homework_LongestStringFrom2User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task2
		
		//2- write a program that can return the longest string from two user inputs
		
		System.out.println("Enter first String");
		
		Scanner scan = new Scanner(System.in);
		
		String userInput1 = scan.next();
		
		
		System.out.println("Enter second String");
		
		String userInput2 = scan.next();
		
		
		if(userInput1.length() > userInput2.length()) {
			
			System.out.println(userInput1 + " is the longest");
		
		}else
			
			System.out.println(userInput2 + " is the longest");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
