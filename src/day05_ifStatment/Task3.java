package day05_ifStatment;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 *  Write a Java Program using if statement.
		 *  Note: Create a variable time as a integer and print below messages: 
			     time is between 1 to 24;
		 *      Good Morning  
			5< 12 
			Good Afternoon
			12 — 17
			Good Evening
			17—24
		 */
		
		Scanner Por = new Scanner(System.in);
		System.out.println("Please type a time ?");

		int Time = Por.nextInt();
		
		
		int time = 15;
		
		if (time <= 5 && time > 12){
			
			
		
			System.out.println("Good morning");
		   }
			
		
		if (time >= 12 && time < 17){
				
				
			
			System.out.println("Good afternoon");
			}
				
		if (time >= 17 && time < 24){
					
					
				
			System.out.println("Good Evening");
			
		
			}
					
					
		Por.close();	
		
		
		
		
		
		
		
	}//end method

}//end class
