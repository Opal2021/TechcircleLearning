package day10_NestLoop;

import java.util.Scanner;

public class MissingFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Task:
//			1. Ask user to enter two words. Print first word without its first character 
//			then print the second word without its first character.
//			                Input:
//			                    apple
//			                    banana
//			                Output:
//			                    ppleanana
//		
//		
		
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter first word");
		
		
		String word1 = Scan.next();
		
		System.out.println("Enter second word");
		
		
		String word2 = Scan.next();
		
		
		
		System.out.println(word1.substring(1)+ word2.substring(1));
		
		
		Scan.close();
		
		
	}//

}//
