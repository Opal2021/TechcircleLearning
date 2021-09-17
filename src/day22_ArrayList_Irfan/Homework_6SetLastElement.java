package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_6SetLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. write a program that can set the last element of the Integer arraylist to zero
//		ex:
//			list = [1,2,3,4,5];
//			output: [1,2,3,4,0];	
		
		
	ArrayList <Integer>	num  = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5));
	
     num.set(4, 0);
	
	System.out.println(num);
	
	
	
		
		
	}//

}//
