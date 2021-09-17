package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_2_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create list of random numbers that contains 20 elements.
		
		
		ArrayList <Integer> num = new ArrayList <Integer> ();
		
		Random random = new Random();
		
		//int rannumber = random.nextInt(9);
		
		//System.out.println(rannumber);
		
		for(int i = 0 ; i <= 20 ; i++) {
			
			int rannumber = random.nextInt(9);
			
			num.add(rannumber);
			//num.add(i,rannumber);
			
		}
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
