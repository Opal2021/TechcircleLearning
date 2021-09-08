package day17_ArrayContinue;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int nums [] = new int [] {5,3,1,2,4};	
		
//		System.out.println(nums[2]);
//		
//		System.out.println(nums[4]);
//		
//		System.out.println(nums.length);
//		
//		System.out.println(nums.length-1);
//		
//		System.out.println(nums[nums.length-1]);
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			System.out.println(nums[i]);
		}
		
		//System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		
		String names [] = {"C","D","A","B"};
		
		
		System.out.println(Arrays.toString(names));
		
        Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		
		//get the Arrays compared 
		
		int intArr[] = {10,20,15,22,35};
		
		int intArr1[] = { 10,15,22};
		
		System.out.println(Arrays.equals(intArr, intArr1));
		
		
		
		
		
		
		
		
		
		
		
	}//

}//
