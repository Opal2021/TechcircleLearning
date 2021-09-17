package day25_MethodParamsAndMethodOverloading;

public class Task4_Unique {

	//4. create a function that can print a string without the duplicated characters
   // "aaabbbccc"
   // abc

	public static void main(String[] args) {
		
		
		String actualResult   = allStringUtil.StringUtil.unique("aaabbbccc");
		
         String expectedResult = "abc";
		
		if (actualResult.equals(expectedResult)) {
			System.out.println("Test passed.");
		}else {
			System.out.println("Test failed");
		}
		
		
		
		System.out.println( allStringUtil.StringUtil.unique("aaabbbcccdddddddddeeeeeeeeeefffffffffff"));
		
		
		
		
		
	}//
			

	
	
//	public static String unique (String str) {
//		
//	     String uniqueChars = "";
//			
//			
//			for(int i = 0 ;i < str.length() ; i ++) {
//				
//				String currentChar = Character.toString(str.charAt(i));
//				
//	            if (!uniqueChars.contains(currentChar)) {
//	            	
//	            
//					
//	            	uniqueChars += currentChar;
//					
//				}
//				
//			}
//			     return uniqueChars ;
//	
//	
//	}
	
	
	
	
	
	
	

	
}//end class
