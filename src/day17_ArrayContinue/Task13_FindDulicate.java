package day17_ArrayContinue;

public class Task13_FindDulicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java program to find the duplicate values of an array of integer values.
		 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

		
		// avoid to print multiple not found
		boolean flag = false;
		
		for(int i = 0 ; i < my_array.length ; i++) {
			
			//System.out.println(" i " + my_array[i]);
			
			for(int j = i +1 ; j < my_array.length ; j++) {
			//System.out.println("j" + my_array[j]);
			
			
			    if(my_array[i] == my_array[j] ) {
			    	
			    System.out.println("Found Duplicate Element :"+ my_array[i]);	
			    
			    flag = true;
			 }

			    
		   }
		}
		
		if(flag == false) {
			System.out.println("Duplicate Element not found");
		}
		
  
		
		String[] my_arrays2  = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};	
		
		
		
		boolean flag2 = false;
		
		for(int i1 = 0 ; i1 < my_arrays2.length ; i1++) {
			
			//System.out.println(" i " + my_arrays2[i1]);
			
			for(int j1 = i1 +1 ; j1 < my_arrays2.length ; j1++) {
			//System.out.println("j" + my_arrays2[j1]);
			
			
			    if(my_arrays2[i1] == my_arrays2[j1] ) {
			    	
			    System.out.println("Found Duplicate Element :"+ my_arrays2[i1]);	
			    
			    flag2 = true;
			 }

			    
		   }
		}
		
		if(flag2 == false) {
			System.out.println("Duplicate Element not found");
		}
		
	}//

}//
