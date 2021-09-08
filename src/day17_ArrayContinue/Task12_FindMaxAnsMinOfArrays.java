package day17_ArrayContinue;

public class Task12_FindMaxAnsMinOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java program to find the maximum and minimum value of an array.
		int[] my_array1 = {
		           1789, 2035, 1899, 1456, 2013,
		           1458, 2458, 1254, 1472, 2365,
		           1456, 2265, 1457, 2456};	
		
		System.out.println(my_array1.length);
		
		int max = 0;
		                      
	    for(int i = 0 ; i < my_array1.length ; i++) {
			
		       if (my_array1[i] > max) {
	   
               max = my_array1[i];
			
	    	}
		 }
		
		System.out.println("Max number is " + max);
		
		
		
	/////////////////////////////////////////////////////////	
		
		
		int min = my_array1[0];
		
	 for(int i = 0 ; i < my_array1.length ; i++) {
			
		       if (my_array1[i] < min) {
				
				min = my_array1[i];
			}
		
		 }
		
		System.out.println("Min number is " + min);
		
		
	}//end Method

}//end class
