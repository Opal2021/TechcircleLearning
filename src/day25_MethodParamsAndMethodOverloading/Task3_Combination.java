package day25_MethodParamsAndMethodOverloading;

import java.util.Arrays;

public class Task3_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. create a function that can print out the combination of two integer arrays
		
		
		int num1 []        = {12,13,14,15};
		
		int num2 []        = {16,17,18,19,10};
		
		int combineArray[] = combine2Arr(num1,num2);
		
		System.out.println(Arrays.toString(combineArray));
		
		
	}//end method

	
	public static int[] combine2Arr (int numarr1 [],int numarr2 []) {
		
//		int numarr1 [] = {1,2,3,4,5};
//		int numarr2 [] = {6,7,8,9};
		
		int numarr3[]  = new int[numarr1.length + numarr2.length];
		
		int position = 0;
		
		for(int num : numarr1) {
			
			numarr3[position] = num;
			position++;
		}
		//System.out.println(Arrays.toString(numarr3));
		
		for(int num : numarr2) {
			
			numarr3[position] = num;
			
			position++;
		}
		
		//System.out.println(Arrays.toString(numarr3));
		
		return numarr3;
		
		
	}
	
	
	
	
	
	
	
}//end class
