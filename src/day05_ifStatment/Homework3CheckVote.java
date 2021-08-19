package day05_ifStatment;

import java.util.Scanner;

public class Homework3CheckVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		write a program that can check if the person is eligible to vote?
//				Note: you need two variables, age, and isUsCitizen
//		
		
		 Scanner input    = new Scanner(System.in);
		 
		 System.out.println("How old are you?");
		 int age          = input.nextInt();
		 
			
		 System.out.println("Are you US Citizen?");
		 String userInputCitizen = input.next();
		 
 
//		String user      = "Yes";
//		int age          = 1;
		
		String usCitizenRestricted = "Yes";
		String Printthis = "";
		
		
		if (age >= 18 ) {
		
		
				if(userInputCitizen.equalsIgnoreCase(usCitizenRestricted)) {
			        Printthis = "You are eligible to vote";
			        
		           }else
		    	    Printthis = "You are not eligible to vote";
	    
		}else 
			
			System.out.println("You are not eligible");
		
		System.out.println(Printthis);
		
		
		
		
		
		
		
		
		input.close();
		
	}//end method

}//end class
