package day10_NestLoop;

import java.util.Scanner;

public class Timer_NestedLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.out.println("Time");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Please enter your wait time in minute");
	
		for(int i = scan.nextInt() ; i > 0 ; i--)	{
		//System.out.println("Minute" + i);
	    
			System.out.println(i-1);
	        
			System.out.println("++++++++++++++++++++++");
	
	    for(int j = 59 ; j > 0 ; j--)	{
		    
	    	System.out.println("Second" + j);
	
	    	Thread.sleep(1000);
	
	
	}//st loop
		
		
	}//nd loop
		
		System.out.println("Time's up");
		
		scan.close();
		
		
		}//end method

}//end class
