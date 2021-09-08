package day16_arrays;

import java.util.Arrays;

public class ReadArraysByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String months [] = new String[12];
		
		
		months[0] = "January";
		
		months[1] = "Febuary";
		
		months[2] = "March";
		
		months[3] = "April";
		
		months[4] = "May";
		
		months[5] = "June";
		
		months[6] = "July";
		
		months[7] = "August";
		
		months[8] = "September";
		
		months[9] = "October";
		
		months[10] = "November";
		
		months[11] = "December";
		
//		System.out.println(months[0]);
//		System.out.println(months[1]);
//		System.out.println(months[2]);
//		System.out.println(months[3]);
//		System.out.println(months[4]);
//		System.out.println(months[5]);
//		System.out.println(months[6]);
//		System.out.println(months[7]);
//		System.out.println(months[8]);
//		System.out.println(months[9]);
//		System.out.println(months[10]);
//		System.out.println(months[11]);
		
		
		
//		System.out.println(months.length);
//		
//		
//		for(int i = 0 ; i < 12 ;i++) {
//			
//			//System.out.println(i);
//			
//			System.out.println(months[i]);
//			
//		}
		
		Arrays.sort(months);
		
        for(int i = 0 ; i < months.length ;i++) {
			
			System.out.println(months[i]);
			
			
		}
		
        
        
        
		}//

}//
