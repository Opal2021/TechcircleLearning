package day17_ArrayContinue;

public class Task14_FindDistinctArrays_usingcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//UniqueIntegers
	    //  1. write a program that can print out the unique numbers from an array of integers
		 //   Ex:
		        int[] arr ={1,1,2,3,3,4};
//		        output:
//		            2 4	
		
		
		for(int i = 0 ; i < arr.length ;i++) {
			
			int count = 0;
			
			for(int j = 0 ; j < arr.length ; j++) {
				
				if (arr[i] == arr[j]) {
				
				count++;
				}
			
				}
			
			if(count == 1) {
				
				System.out.println(arr[i]);
			}
			
			
		}
		      
		
		
		      
		
		
		
		
		
		
		
		
		
	}//

}//
