package day17_ArrayContinue;

import java.util.Arrays;

public class Task15_Input3Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input:
		//	int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
			/*
			            task1:
			                9 10 11 12 13
			                4 5 6 7 8
			                1 2 3
			            task2:
			            	3 2 1
			            	8 7 6 5 4
			            	13 12 11 10 9
			        	task3:
			        		13 12 11 10 9
			        		8 7 6 5 4
			        		3 2 1
			 */	
		
		//Task1
		
	
		
		int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
		
		int  length = arr2D.length;
		
		for(int i = 0 ; i < length ; i++) {
			
			//System.out.println(Arrays.toString(arr2D[i]));
			
			for(int j = 0 ; j < arr2D[i].length ; j++) {
				
				System.out.print(arr2D[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("____________________");
		
           
		for(int i = length -1 ; i >= 0 ; i--) {
			
			//System.out.println(Arrays.toString(arr2D[i]));
			
			for(int j = 0 ; j < arr2D[i].length ; j++) {
				
				System.out.print(arr2D[i][j]+",");
				}
			System.out.println();
		}
		
		System.out.println("____________________");
		
            for(int i = 0 ; i < length ; i++) {
			
			//System.out.println(Arrays.toString(arr2D[i]));
			
			for(int j =  arr2D[i].length-1 ; j >= 0 ; j--) {
				
				System.out.print(arr2D[i][j]+",");
				}
			System.out.println();
		}
           
            System.out.println("____________________");
    		
		
            for(int i =length -1 ; i >= 0; i--) {
    			
    			//System.out.println(Arrays.toString(arr2D[i]));
    			
    			for(int j =  arr2D[i].length-1 ; j >= 0 ; j--) {
    				
    				System.out.print(arr2D[i][j]+",");
    				}
    			System.out.println();
    		}
		
		
		
	}//

}//
