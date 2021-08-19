package day05_ifStatment;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // create instance of scanner object
		
		System.out.println("Please type a number");
		
	//	int a = 10;
		
		
		int a = scan.nextInt();
		
		System.out.println(" Type some double number");
		
		double value = scan.nextDouble();
		
		
		System.out.println("Value of a is" + a);
		
		
		
		
		//scan.close();
		
//		
//        Scanner age = new Scanner(System.in); 
//		
//		System.out.println("Please type your age");
//		
//         int b = age.nextInt();
//		
//		System.out.println("Value of a is" + b);
//		
//		
		 int b = 10;
		 
		 int c = a + b ;
		 
		 System.out.println("result = "+ c);
		 
		 
		 System.out.println("Value of my double variable is "+ value);
		 
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		}// end method

}//end class
