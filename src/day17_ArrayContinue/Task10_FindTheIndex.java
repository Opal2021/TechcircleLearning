package day17_ArrayContinue;

import java.util.Arrays;

public class Task10_FindTheIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Write a Java program to find index of Jenkins before sorting and after sorting.
		
		String[] my_array2 = {"Java", "JDBC","SQL","Junit","Selenium", "Jenkins","Cucumber","Agile", "SDLC",
		 
		                      "WebDriver"};
		        
		       
     //System.out.println(my_array2.length);//10
//	
//	     System.out.println(my_array2[0]);
	 	
//	 	System.out.println(" Element 1 is" +my_array2[0]);
//	 	System.out.println(" Element 2 is" +my_array2[1]);
//	 	System.out.println(" Element 3 is" +my_array2[2]);
//	 	System.out.println(" Element 4 is" +my_array2[3]);
//	 	System.out.println(" Element 5 is" +my_array2[4]);
//	 	System.out.println(" Element 6 is" +my_array2[5]);
//	 	System.out.println(" Element 7 is" +my_array2[6]);
//	 	System.out.println(" Element 8 is" +my_array2[7]);
//	 	System.out.println(" Element 9 is" +my_array2[8]);
//	 	System.out.println(" Element 10 is" +my_array2[9]);
	 	
	 	for(int i = 0 ;i < my_array2.length ; i++) {
	 		
	 		//System.out.println(my_array2[i]);
	 		
	 		if (my_array2[i].equals("Jenkins")) {
	 			
	 		System.out.println("Jenkins is index " + i);
			}
	 	}
	 	
	//                           10
	     for(int i = 0 ; i < my_array2.length ; i++) {
			}
			Arrays.sort(my_array2);
			System.out.println(Arrays.toString(my_array2));
			
			for(int i = 0 ;i < my_array2.length ; i++) {
		 		
				//System.out.println(my_array2[i]);
		 		
				if (my_array2[i].equals("Jenkins")) {
					
		 			System.out.println("Jenkins is index " + i);
				}
		 	}
		 		
			System.out.println(" Element 1 is" +my_array2[0]);
		 	System.out.println(" Element 2 is" +my_array2[1]);
		 	System.out.println(" Element 3 is" +my_array2[2]);
		 	System.out.println(" Element 4 is" +my_array2[3]);
		 	System.out.println(" Element 5 is" +my_array2[4]);
		 	System.out.println(" Element 6 is" +my_array2[5]);
		 	System.out.println(" Element 7 is" +my_array2[6]);
		 	System.out.println(" Element 8 is" +my_array2[7]);
		 	System.out.println(" Element 9 is" +my_array2[8]);
		 	System.out.println(" Element 10 is" +my_array2[9]);
	       
			
	}//

}//
