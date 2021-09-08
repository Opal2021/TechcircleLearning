package day18_ArraysList;

import java.util.ArrayList;

public class Task1_CreateTheNewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to create a new array list, add some colors (string) 
//		and print out the collection.
		
		ArrayList<String>	arrcolor = new ArrayList<String>();
		
		arrcolor.add("pink");
		arrcolor.add("blue");
		arrcolor.add("white");
		arrcolor.add("green");
		
		System.out.println(arrcolor);
		
		
       for(String color : arrcolor) {
			System.out.println(color);
		}	
		
		
	}//

}//
