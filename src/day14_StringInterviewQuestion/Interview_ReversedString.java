package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Interview_ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Write a program to reverse a string
//		input = ABCD
//		output = DCBA
		
       
      // String  input = "ABCD";
		Scanner scan = new Scanner(System.in);
		System.out.println("type word");
		String input = scan.nextLine();
       
       for(int i = input.length()-1; i >=0 ;i--) {
    	   
    	   System.out.print(input.charAt(i));
       }
      		
		scan.close();
		
		
		//StringBuilder
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ABCD");
		
		sb.reverse();
		
		System.out.println(sb);
	
		

//		System.out.println("Enter your word");	
//        
//		Scanner scan = new Scanner(System.in);
//		
//		String input = scan.next();
//		
//		for(int i = input.length()-1 ; i >= 0 ; i--) {
//		
//		System.out.print(input.charAt(i));
//    
//		}
		
			
	}//

}//
