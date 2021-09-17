package day22_ArrayList_Irfan;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_2DoubleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	2.  Write java program  that can add a double after the last index of a double array
		
		
		double num [] = new double [] {1.1,2.2,3.3,4.4};
		
		
		double num2 [] = new double [num.length+1];
		
		for(int i = 0 ; i < num2.length-1 ;i ++) {
			
			num2[i] = num[i];
			
			
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter double number");
		
		double input = scan.nextDouble();
		
		
		
		num2[num2.length-1] = input;
		
		System.out.println("New set of number are" + Arrays.toString(num2));
		
		
		scan.close();
		
		
		
		
		
		
		
	}//

}//
