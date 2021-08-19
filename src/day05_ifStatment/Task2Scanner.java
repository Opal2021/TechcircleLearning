package day05_ifStatment;

import java.util.Scanner;

public class Task2Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double	overdrawnPenalty = 8.0;
	
	double	interestRate     = 0.02;
		
	double	balance;
	
	System.out.println("Enter your checking account balance : $");
	
	Scanner scanner = new Scanner(System.in);
	
	balance  = scanner.nextDouble();
	
	System.out.println("Original balance $" + balance);
	
	if (balance >= 0) {
		
		balance = balance + (interestRate * balance ) / 12;
	
		
	}else {
		balance = balance - overdrawnPenalty ;
		
	}
		
		System.out.println(" Your new balance is $ " + balance );
		
	
		
		
		
	scanner.close()	;
	
	
		
		
		
		
	}//end method

}//end class
