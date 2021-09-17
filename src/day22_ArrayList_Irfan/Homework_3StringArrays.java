package day22_ArrayList_Irfan;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.  Write java program s that can add a String after the last index of a String array
		
		
	String country []	= new  String [] {"Thailand","Canada","USA"};
		
		
		String country2 [] = new String [country.length+1];
		
		for(int i = 0 ; i < country2.length-1 ; i++) {
			
			country2[i] = country[i];
			
			
		}
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Country");
		
		String input = scan.next();
		
		country2[country2.length-1] = input;
		
		System.out.println("The new set of country are " + Arrays.toString(country2));
		
		
		scan.close();
		
		
		
		
		
		
		
	}//

}//
