package day17_ArrayContinue;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {5,4,3,2,1};
		
		int nums2 [] = {1,2,3,4,5};
		
		int nums3 [] = {2,3,4,5};
		
		System.out.println(Arrays.equals(nums, nums2));
		
		System.out.println(Arrays.equals(nums2, nums3));
		
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.equals(nums, nums2));
		
		
        Arrays.sort(nums3);
		
		System.out.println(Arrays.equals(nums2, nums3));
		
		
		
		
		
		
		
		
	}//

}//
