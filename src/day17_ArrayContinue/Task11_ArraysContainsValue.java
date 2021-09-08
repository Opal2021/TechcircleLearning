package day17_ArrayContinue;

import java.util.Arrays;
import java.util.Iterator;

import day07_loop.For_Loop;

public class Task11_ArraysContainsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to test if an array contains a certain value
	    int[] my_array1 = {
	           1789, 2035, 1899, 1456, 2013,
	           1458, 2458, 1254, 1472, 2365,
	           1456, 2265, 1457, 2456};
	//Check if 2019 , 2013contains above array.
	    
	  boolean check = false;
	   
	
	for(int element : my_array1) {
		
	//	System.out.println(i);
		
		if(element == 2019 || element == 2013) {
			
			System.out.println(element + "found");
			
			check = true;
		}else
			
			
			System.out.println("Not found");
		}
			
			if(check == false){
	         System.out.println("Not found");
	       }
	 
	
	
	//		
//	for (int i = 0; i < my_array1.length; i++) {
//		//System.out.println(my_array1[i]);
//		
//		if (my_array1[i] == 2019 || my_array1[i] == 2013) {
//			System.out.println(my_array1[i]);
//		}
//		
		
//}
	
			int targetNumber = 17898;

			boolean flag = false;

			for (int dina : my_array1) {
//				if (dina == targetNumber) {
//					System.out.println("I found 2019");
//					break;
//				}else {
//					System.out.println("2019 is not there");
//				}
				if (dina == targetNumber) {
					flag = true;
				}

			}

			if (flag) {
				System.out.println("I found " + targetNumber);

			} else {
				System.out.println(targetNumber + " is not there");
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
