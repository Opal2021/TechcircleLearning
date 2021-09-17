package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_8FindUniqueArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//write a program that find the unique names from an arraylist of string
		
		
	ArrayList <String>	 names = new ArrayList <String> 
	
	(Arrays.asList("Peter","Evan","Tom","Tom","Peter","Kaya"));
	
	
	
	for(int i = 0 ;i < names.size() ; i ++) {
		
      int count = 0;
			
			for(int j = 0 ; j < names.size() ; j++) {
				
				if (names.get(i).equals(names.get(j)) ) {
				
				count++;
				}
			
				}
			
			if(count == 1) {
				
				System.out.println(names.get(i));
			}
		}
		
		
		}//

}//
