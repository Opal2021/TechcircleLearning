package day09_LoopReview;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		
		
		//System.out.println(random.nextInt(100));
		
		for(int i = 0 ; i< 11 ;i++) {
			
			System.out.println(random.nextInt(100));
			
		}
		// Task phone number
		
		//703 | 571 | 202 + 123 + 1234
		
		String areaCode  = "703";
		
//		System.out.println(areaCode);
//		System.out.println(random.nextInt(1000));
//		
//		System.out.println(random.nextInt(9999));
//		
		
		for(int i = 1 ; i < 101 ;i++) {
			
			System.out.println(areaCode);
			System.out.println(random.nextInt(1000));
			
			System.out.println(random.nextInt(9999));
			
			System.out.println();
			System.out.println();
			
			
		}

		
		}//end method

}//end class
