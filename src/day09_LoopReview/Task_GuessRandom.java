package day09_LoopReview;

import java.util.Random;
import java.util.Scanner;

public class Task_GuessRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		//System.out.println(random.nextInt(4));
		
		
		
		for(int i = 1 ; i <= 3 ; i++) {
			
			System.out.println("Enter Guess number");
			
			int userInput = input.nextInt();
			
			if(userInput == random.nextInt(4)) {
				System.out.println(" You win !!!");
				break;
				
			}else
				System.out.println("Try again");
			
		}
		
		
		}//end Method

}//end Class
