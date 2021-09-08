package day17_ArrayContinue;

import java.util.Arrays;

public class Task09_SortNumaricArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 9:
//			Write a Java program to sort a numeric array and a string array.
//			int[] my_array1 = {
//			           1789, 2035, 1899, 1456, 2013,
//			           1458, 2458, 1254, 1472, 2365,
//			           1456, 2165, 1457, 2456};
//
//			String[] my_array2 = {
//			           "Java",
//			            
//			           "JDBC",
//			           "SQL",
//			           "Junit",
//			           "Selenium",
//			           "Jenkins",
//			        "Cucumber",
//			         "Agile",
//			          "SDLC",
//			           "WebDriver"
//			        
	
		
		int[] my_array1 = {
		           1789, 2035, 1899, 1456, 2013,
		           1458, 2458, 1254, 1472, 2365,
		           1456, 2165, 1457, 2456};
	
         for(int i = 0 ; i < my_array1.length ; i++) {
			
			//System.out.println(my_array1[i]);
		}
		
		Arrays.sort(my_array1);
		
		System.out.println(Arrays.toString(my_array1));
		
	
		String[] my_array2 ={"Java",
		            
		           "JDBC",
		           "SQL",
		           "Junit",
		           "Selenium",
		           "Jenkins",
		        "Cucumber",
		         "Agile",
		          "SDLC",
		           "WebDriver"};
	
          for(int i = 0 ; i < my_array2.length ; i++) {
			
			//System.out.println(my_array2[i]);
		}
		
		Arrays.sort(my_array2);
		
		System.out.println(Arrays.toString(my_array2));
		
	}//

}//
