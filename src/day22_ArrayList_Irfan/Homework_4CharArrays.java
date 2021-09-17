package day22_ArrayList_Irfan;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_4CharArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Write java program that can add a char after last index of a char array
		
		
		char letters [] = new char [] {'A','B','C','D'};
		
		char letters2 [] = new char[letters.length+1];
		
		for(int i = 0 ; i < letters2.length-1 ;i++) {
			
			letters2[i] = letters[i];
			
		}
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a single char");
		
		//next does not have next.char so we  put charAt to call only first index (0)
		char input = scan.next().charAt(0);
		
		letters2[letters2.length-1] = input;
		
		System.out.println(Arrays.toString(letters2));
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
