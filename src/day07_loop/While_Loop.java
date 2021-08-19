package day07_loop;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// While Loop
		
	int count, number;
//	
//	System.out.println("Enter a number");
//	Scanner keyboard = new Scanner(System.in);
//	number = keyboard.nextInt(); //number = 0
//	
//	count = -2;
//	
//	//count=1; number =0
//	while (count <= number) {
//		System.out.print(count+", ");
//		count++;
//	}
//	
//	System.out.println();
//	System.out.println("Buckle my shoe.");
//	
//	System.out.println(count);
//		
		
//	int i = 0;
//	while (i < 5) {
//		System.out.println(i);
//		i++;	
	
		
//	int x = 10;
//	int y = 20;
//	
//	while (x<y) {
//		System.out.println("Value of x: " +x);
//		x++;

	
	// Java Do While Loop
	
	
	
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt(); //number = 0
		
		count = 1;
		
		//count=1; number =0
		do{
			System.out.print(count+", ");
			count++;
		}while(count <= number);
		
		System.out.println();
		System.out.println("Buckle my shoe.");
		
		System.out.println(count);
	
	
	
		int i = 10;
		// i = 9
		do {
			System.out.println(i);
			i--;
		}while(i < 1);
	
	
	
	
	
		
	}//end Method

}//end class
