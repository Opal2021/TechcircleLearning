package day17_ArrayContinue;

import java.util.Arrays;

public class Task02_Conbine2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums1[] = {1,2,3,4,5};
		
		int nums2[] = {6,7,8,9,10};
		
		int nums3[] = new int[nums1.length+nums2.length];
	
		int position = 0;
		
         for(int i = 0 ; i < nums1.length; i++) {
			
//			System.out.println(nums1[i]);
//			nums3[0] = nums1[0];
			nums3[position] = nums1[i];
			position++;
		}
		
		System.out.println(Arrays.toString(nums3));
		
		for (int i = 0; i < nums2.length; i++) {
			
//			System.out.println(nums2[i]);
//			nums3[0] = nums1[0];
			nums3[position] = nums2[i];
			position++;
		}
		
		System.out.println(Arrays.toString(nums3));
		
		
		
//	    num3[0]  =  num1 [0];
//		num3[1]  =  num1 [1];
//		num3[2]  =  num1 [2];
//		num3[3]  =  num1 [3];
//		num3[4]  =  num1 [4];
//		
//		
//		System.out.println(Arrays.toString(num3));
//		
//		
//		num3[0]  =  num2 [0];
//		num3[1]  =  num2 [1];
//		num3[2]  =  num2 [2];
//		num3[3]  =  num2 [3];
//		num3[4]  =  num2 [4];
//		
//		
//		System.out.println(Arrays.toString(num3));
//		
		
		
		
		
		
		
		
		
		
	}

}
