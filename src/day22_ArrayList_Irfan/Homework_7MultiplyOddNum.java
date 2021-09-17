package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_7MultiplyOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		2. write a program that can multiply each odd number by 2
//		ex:
//		    list = [1,2,3,4,5];
//			output: [2,2,6,4,10]
//		
		
		ArrayList <Integer> num = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5));
		
		ArrayList <Integer> num2 = new ArrayList <Integer> ();
		
		
		
		
		for(int i= 0 ; i < num.size() ;i ++) {
			
			if (num.get(i) % 2 == 1) {
				
				num2.add(num.get(i)*2);
				
				}
			 if(num.get(i) % 2 == 0) {
				 
				 num2.add(num.get(i));
				 
			 }
			
		}
		
	System.out.println(num2);
		
	
		
		// This one  is Array not ArrayList
		
//	int[] myArray = { 1, 2, 4, 13, 5, 8, 41, 20 };
//	
//	for (int i = 0; i < myArray.length; i++) {
//		
//		if (myArray[i] % 2 == 1) {
//			
//			myArray[i] *= 3;
//		}
//	}
//	System.out.println(Arrays.toString(myArray));
//		
		
		
		
		
		
		
		
		
	}

}
