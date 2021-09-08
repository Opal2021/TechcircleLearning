package day10_NestLoop;

public class CodilityTestCoders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/*
//		 * That, given positive Integer N, 
//		 * Points the consecutive numbers from 1 to N,
//           each on a separate line, However,
//           and number divisible by 2, 3, 5, should be replaced by 
//           the word Codility, Test, Coders respectively.
//           
//         *If the number divisible by more than one 
//         *if the numbers: 2,3 or 5, 
//         *it should be replaced by a concatenation of the respective words
//         * Codility, Test, and Coders in the given order.
//         * For example, numbers divisible by both 2 and 3 should be replaced
//         *  by CodilityTest and numbers divisible by all three 
//         *  numbers: 2,3, and 5, should be replaced by CodilityTestCoders.
//         *  For example, here is the output for 24:
//         *  1

//			Codility
//			Test
//			Codility
//			Coders
//			CodilityTest
//			7
//			Codility
//			Test
//			CodilityCoders
//			11
//			CodilityTest
//			13
//			Codility
//			TestCoders
//			Codility
//			17
//			CodilityTest
//			19
//			CodilityCoders
//			Test
//			Codility
//			23
//			CodilityTest
//		 
		
//		for(int i = 1 ; i <= 24 ; i++) {
//			
//			System.out.println(i);
//			
//			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//				
//				System.out.println(" CodilityTestCoders ");
//			}	
//			
//				String PrintThis = "";
//			   
//
//				if(i % 2 == 0 && i % 3 == 0) {
//				PrintThis = "CodilityTest";
//
//				if(i % 2 == 0 && i % 5 == 0) {
//				PrintThis = "CodilityTest";
//				
//                if(i % 3 == 0 && i % 5 == 0) 
//		        PrintThis = "CodilityTest";
//		        }
//				
//		       System.out.println(PrintThis);
//				
//			
//				}
//			
//			
		
		String str1 = "Codility";
		String str2 = "Test";
		String str3 = "Coders";
		
		String msg = "";
		
		
		for(int i = 1 ; i <=34; i ++) {
			
			
			if (i % 2 == 0) {
				msg = str1;
			}
			
			if (i % 3 == 0) {
//				msg += str2;
				
				msg = msg.concat(str2);
			}
			
			if (i % 5 == 0) {
//				msg += str3;
				msg = msg.concat(str3);
			}
			
			if (msg.length() == 0) {
				System.out.println(i);
			}else {
				System.out.println(msg);
			}
			
			msg = "";
				
		}		
					
			}//end Method

		}//end Class
