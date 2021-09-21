package day26_Tasks;

import java.util.Arrays;

public class Task_MaximunNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	create a method that can print out the maximum number from any given integer array
		
		
	int num []	= new int  [] {1,2,10,4,5,6,};
//	Arrays.sort(num);
//	System.out.println(Arrays.toString(num));
//	System.out.println(num[num.length-1]);
//	
	  num1(num);
	  
	  int maximum = num1(num);
	  
	  System.out.println(maximum);
//=============================================================		
	 
	  int numarr [] = new int [] {12,44,54,67,87};
	 
	  int minimumNum = minNum(numarr);
	  
	  System.out.println(minimumNum);
	  
	  
	  
	  
		
	}//end method

	public static int num1 (int x[]) {
		
		//int num []	= new int  [] {1,2,10,4,5,6,};
		
	  Arrays.sort(x);
	  
	  int max = x[x.length-1];
		
		return max;
		
	}
	
	public static int minNum(int y[]) {
		
		// int numarr [] = new int [] {12,44,54,67,87};
		  
		  
		  int min = y[0];
		  
		  for(int i = 0 ; i < y.length; i ++) {
			  
			 if(y[i] < min) {
				 
				 min = y[i];
			}
			  
		  }
		  //System.out.println(min);
		  
		return min;
	}
	
}//end class
