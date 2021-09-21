package day26_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to merge two lists in java?
				
	//			List1 =  {1,2,3,4,5,6,7}
	//			list2 = {11,22,33,44,55,66,77}
				
//				create a method to merge 2 list, and return the sum of all the numbers
		
		
		ArrayList <Integer> num1 = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5,6,7));
		
		ArrayList <Integer> num2 = new ArrayList <Integer> (Arrays.asList(11,22,33,44,55,66,77));
		
		//ArrayList <Integer> num3 = new ArrayList <Integer> ();
		
		int total = totalNum(num1,num2);
		
		System.out.println(total);
		
	//======================Method 1================================================	
		
		num1.addAll(num2);
		
		System.out.println(num1);
		
	//================method 2 =====================================================	
		
		Iterator<Integer> iterator = num2.iterator();
		
		//System.out.println(num1);
			
		while(iterator.hasNext()) {
			
			System.out.println();
			
			num1.add(iterator.next());
		}
		
		System.out.println(num1);
		
	//=============================================================	
		
	}//end method
	
	
	public static int totalNum (ArrayList <Integer> x , ArrayList <Integer> y) {
	
		ArrayList <Integer> num3 = new ArrayList <Integer> ();
		
       for(int i = 0 ; i < x.size() ; i++) {
			
			num3.add(x.get(i));
			
		}
		
		//System.out.println(num3);
		
		for(int i = 0 ; i < y.size(); i ++) {
			
			num3.add(y.get(i));
		
		}
		
		//System.out.println(num3);
		
		int sum = 0;
		
		for (int i = 0 ;i < num3.size(); i++) {
			
			sum = sum + num3.get(i);
			
		}
		
		//System.out.println(sum);
		
		
		
		return sum;
		
	}
	
}//end class
