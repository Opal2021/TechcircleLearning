package day10_NestLoop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				Random random = new Random();
				
				int secretNuymber = random.nextInt(100);
				
//				System. out.println(secretNuymber);
				
				int attempt = 10;
				
				Scanner scan = new Scanner(System.in);
				
				for (int i = attempt ; i >= 1 ; i --) {
					System.out.println("Please guess a number!");
					
					int num = scan.nextInt();
					
					
					if (num == secretNuymber) {
						System.out.println("Congrats!");
						break;
					}else if (num > secretNuymber) {
						System.out.println("Too High");
					}else {
						System.out.println("Too low");
					}
			}
				
				
				System.out.println("Thanks for Playing!, Game over");
				
				
				scan.close();
				
	      }//end Method

}//end class
