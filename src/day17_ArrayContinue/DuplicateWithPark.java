package day17_ArrayContinue;

public class DuplicateWithPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num [] = {11,22,11,33,22};
		
		for(int i = 0 ; i < num.length ; i++) {
			
			//System.out.println("i : "+num[i]);
		
		  for(int j = i+1 ; j < num.length ; j++ ) {
			  
			  //System.err.println("j: "+num[j]);
			  //  11        22
			  if(num[i] == num[j]) {
				  
				 // System.out.println(num[i]);
			  }
		  }
		
	}
		
		
		//Write a Java program to find the duplicate values of an array of integer values.
		
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		
		
		//System.out.println(my_array.length);
		
		for(int i = 0 ; i < my_array.length ; i++) {
			
			//System.out.println(" i "my_array[i]);
			
			         
		      for(int j = i+1; j < my_array.length ; j++) {
		    	  
		    	 // System.out.println(" j" + my_array[j]); 
		    	  //   1        ==   2
		    	  //   1        ==   5
		    	  //   1        ==   5
		    	  //   1        ==   6
		    	  //   1        ==   6
		    	  //   1        ==   7
		    	  //   1        ==   2
		    	  //   2        ==   5
		    	  //   2        ==   5
		    	 
		    	 if(my_array[i] == my_array[j]) {
		    		  
		    		  System.out.println(" Duplicate number is " +my_array[i]);
		    		  
		    		 
		    	  }
		    	  
		      }
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}//

}//
