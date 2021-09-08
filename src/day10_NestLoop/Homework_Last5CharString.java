package day10_NestLoop;

import java.util.Scanner;

public class Homework_Last5CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		6, Make it total of 5 characters
//		Write a program that checks the length of the string. 
//		If the string length is less than 5 characters then add any character and make it total of five character.
//		if the length is equal to 5 then keep the original string. 
//		if string length greater than 5 characters then keep the last 5 characters.
//		Examples:
//		String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
//		//expected "puter" , "JavaA" "Pizza"

//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter word");
//		
//		String word = input.next();
//		
//		System.out.println(word.length());
//			
//		int wordL = word.length();
//		
//		if(wordL > 5 ) {
//			
//			System.out.print(word.charAt(wordL-5));
//			
//			System.out.print(word.charAt(wordL-4));
//			
//			System.out.print(word.charAt(wordL-3));
//			
//			System.out.print(word.charAt(wordL-2));
//			
//			System.out.println(word.charAt(wordL-1));
//			
//		}
//		if(wordL == 4) {
//			
//			System.out.println(word.concat("A"));
//		}
//	
//			
//        if(wordL == 3) {
//			
//			System.out.println(word.concat("AA"));
//		}
//				
//        if(wordL == 2) {
//	
//	        System.out.println(word.concat("AAA"));
//        }		
//        if(wordL == 1) {
//	
//	        System.out.println(word.concat("AAAA"));
//        }    	
//		
//        if(wordL == 5) {
//        	
//	        System.out.println(word);
//        }    	
//		
//		
//		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter word");
		
		String word = input.next();
		//String word = "";
	    //System.out.println(word.length());
			
		int wordL = word.length();
		
		if(wordL > 5 ) {
			
		int startChar = wordL -5;
			
			for(int i = startChar ; i <= wordL -1; i++) {
				
				System.out.print(word.charAt(i));
			}
		}	
		if(wordL <= 5) {
			
		
		switch(wordL) {
		
		case 1:
		System.out.println(word.concat("AAAA"));
		
		break;

		case 2:
		System.out.println(word.concat("AAA"));
		break;

		case 3:
		System.out.println(word.concat("AA"));
		
		break;
		case 4:
		System.out.println(word.concat("A"));
		
		break;
		case 5:
		System.out.println(word);
		
		break;
		
		default:
			
			System.out.println("Invalid");
		
		}
		
		}
		
	// Irfan Method
		
		
		
		
        String str = "computer12345";
		
		if (str.length() == 5) {
			System.out.println(str);
		}
		
		
		if (str.length() < 5) {
			
			String str2 = str+"123456789";
			
			System.out.println(str2.substring(0, 5));
			
			
		}
		
		if (str.length() > 5) {
			System.out.println(str.substring(str.length()-5));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end method

}//end class
