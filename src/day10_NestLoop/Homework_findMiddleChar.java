package day10_NestLoop;

public class Homework_findMiddleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		5, Find the middle character of a string
//		Write a Java program to find the middle character of a string. 
//		 If the length of the string is odd there will be one middle character.
//		 If the length of the string is even there will be 2 middle characters.
//		Input: abcde
//		output:c
//		intput car11car
//		output 11	
		
		// INterview
		
//		String userInput = "car11car";
//		
//		
//		int strLength = userInput.length();
//		
//		//System.out.println(userInput.charAt(2));
//		
//		if(userInput.length() % 2 == 1){
//			
//			
//			System.out.print(userInput.charAt((userInput.length()/ 2)-1));
//			
//			System.out.print(userInput.charAt((userInput.length()/ 2)));
//			
//			System.out.println(userInput.charAt((userInput.length()/ 2)+1));
//		
//		}else 
//			if(userInput.length() % 2 == 0){
//			System.out.print(userInput.charAt((strLength/2) -1 ));
//			System.out.println(userInput.charAt((strLength/2)));
//		    //System.out.println(userInput.charAt((userInput.length()/ 2)-1));
//		}
//			
//	
		    
		String userInput = "car12car";
		
		System.out.println(userInput.length());
		
			if(userInput.length() % 2 ==1 ) {
				
				System.out.println(userInput.charAt(userInput.length() / 2));
				
			}else {
				
			    System.out.print(userInput.charAt(userInput.length()/ 2 - 1));
			
	            System.out.println(userInput.charAt(userInput.length() / 2));
		
			}
		
		
		
		
		
		
		
	}//end method

}//end class
