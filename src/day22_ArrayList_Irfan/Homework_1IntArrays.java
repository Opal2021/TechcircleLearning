package day22_ArrayList_Irfan;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_1IntArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1. Write java program that can add an Integer  after the  last index of an integer array
		
		
		int num [] = new  int [] {1,2,3,4,5};
		
		System.out.println("Original set of numbers are" + Arrays.toString(num));
		
		// create empty array which is bigger than original array one size
		int num2 [] = new int [num.length+1] ;
		
		
		// Adding elements from the original array to the new array using loop
		for(int i = 0 ; i < num2.length-1 ; i++) {
			
			num2[i]= num [i];
			
		}
		
		Scanner scan = new Scanner (System.in);
		// manually add last index 
		
		System.out.println("Enter a number: ");
		int input = scan.nextInt();
		
		// adding the last index
		num2[num2.length-1] = input;
		
		System.out.println("New set of numbers are" +Arrays.toString(num2));
		
		
		scan.close();
		
		}//

}//
