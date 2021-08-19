package day05_ifStatment;

import java.util.Scanner;

public class Homework1TimeAmPm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to find current time is am or pm ?  
//				Write a program to find current time is am or pm ?
//				if current time is > 12 then its PM
//
//				if current time is < 12 then its AM
//				input :
//				5
//				output:
//				current time is 5 AM
//				input = 16;
//				current time is 4 PM;
//		
		System.out.println("What time is it?");
		
		Scanner input = new Scanner(System.in);
		
		int time = input.nextInt();
		
		//int time = 24;
		
		String PrintThis = "Noon";
		
		if( time >=  1 && time <= 24) {
			
		             if (time < 12) {
						PrintThis = "Current time is " + time + " AM";
					}
		             if(time > 12) {
						PrintThis = "Current time is " + (time - 12)+ " PM";
					 if (time == 24) {
						PrintThis = "Current time is " + (time - 12)+ " AM";
					}
						
					}
		}else
			System.out.println(" Out of bound");
		    
		    System.out.println(PrintThis);
		
		
		input.close();
		
		
		
		
		
	}//end method

}//end class
