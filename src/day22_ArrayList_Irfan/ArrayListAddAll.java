package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Integer> nums1= new ArrayList<Integer>	(Arrays.asList(1,3,5,7,9));
		
	ArrayList<Integer> nums2= new ArrayList<Integer>	(Arrays.asList(2,4,6,8));	
		
	Iterator<Integer> iterator = nums2.iterator();
	
	System.out.println(nums1);
		
	while(iterator.hasNext()) {
		
		System.out.println();
		
		nums1.add(iterator.next());
	}
		
	System.out.println(nums1);	
		
	ArrayList<Integer> nums3= new ArrayList<Integer>();
		
		System.out.println(nums3);
		
		
		nums3.addAll(nums1);
		nums3.addAll(nums2);
		nums3.addAll(3,nums2);
		
		System.out.println(nums3);
		
	
	}//

}//
