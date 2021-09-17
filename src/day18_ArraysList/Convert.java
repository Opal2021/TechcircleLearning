package day18_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	Task 13:
//			Write a Java program to find the duplicate values of an array of integer values.
		//	 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
	//
			
			
//			System.out.println(Arrays.toString(my_array));
//			int a = 0;
//			
//			for (int i = 0; i < my_array.length; i++) {
//				a = my_array[i];
//				for (int j = i+1; j < my_array.length; j++) {
//					if (my_array[j] == a) {
//						System.out.println(my_array[i]);
//					}
//				}
//			}
			
			
			 
//			 ArrayList<Integer>
			 
			 
			 Integer num = 55;
//			 
			 String num2 = num.toString();
//			 
//			 System.out.println(num2);//55
			 System.out.println(num2.charAt(0));//5
//			 
//			 int num3 = 99;
//			 
////			 String num4 = ""+num3;
//			 String num4 = String.valueOf(num3);
			 
			 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
				//
			 String uniqueElements = "";
			 
			 
			 for(int i = 0; i < my_array.length; i++ ) {
				 
				 if (!uniqueElements.contains(String.valueOf(my_array[i]))) {
					 uniqueElements += String.valueOf(my_array[i]).concat(",");
				 }

			 }
			 
			 System.out.println(uniqueElements);
			 
			 // Take out the last comma
			 // Substring will print from index 0 to last index(which is not counted)
			 uniqueElements = uniqueElements.substring(0,uniqueElements.length()-1);
			 System.out.println(uniqueElements);
			 
			 //if use .split it will automatically become Array
			
			 String numbers[] = uniqueElements.split(",");
			 
			 
			 // Array int []
//			 System.out.println(Arrays.toString(my_array));
			 
			 // Arrays String []
//			 System.out.println(Arrays.toString(numbers));
			 
			 System.out.println("This is number: "+numbers.length);
			 
			 int uniqueNumberArr[] = new int[numbers.length];
			 
			 System.out.println(Arrays.toString(uniqueNumberArr));
//			 uniqueNumberArr[0] = 9;
//			 uniqueNumberArr[0] = "9";
			 
			int convertNum = 0;
			 
			 for(int i = 0 ; i < numbers.length ; i++) {
				 
				  convertNum = Integer.parseInt(numbers[i]);
				  
				  for(int j = 0 ; j < uniqueNumberArr.length ; j++) {
						 
						 uniqueNumberArr[j] = convertNum;
					//	 convertNum         = ;
						
						 
					 
					    }
			//System.out.println(convertNum);// unique integer
			 }
			 System.out.println(convertNum);
//			 for(int j = 0 ; j < uniqueNumberArr.length ; j++) {
//				 
//				 uniqueNumberArr[j] = convertNum;
//				 
//			    }
//			 
//			 
			 System.out.println(Arrays.toString(uniqueNumberArr));
			 
			 
			 
			 
			 String strNum = "9";
			 //convert String to Integer using Integer.parseInt()
			int myNumber =  Integer.parseInt(strNum);
			 //-----------> Float.parseFloat()
			 System.out.println(myNumber);
			
			 System.out.println(strNum + 1);//91
			
			 System.out.println(myNumber + 1);//10
			 
			 
//			String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
			
			
			
			
			// Example using .split
			
//			String words = "This is a book";
//			
//			String splitWord [] = words.split(" ");
//			
//			System.out.println(Arrays.toString(splitWord));
		
		}//

}//
