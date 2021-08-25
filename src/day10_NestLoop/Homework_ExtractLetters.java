package day10_NestLoop;

public class Homework_ExtractLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Extract letters from a String
//		Write a program to extract all the letter from a given alphanumeric string "a1b2c34d098098efg"
//		output:
//		abbdefg
//		
			
		
		
		
		String userInput = "a1b2c34d098098efgAAA";
		
	   //	String replaceAll = userInput.replaceAll("[0-9]", "");
		
		
		//	System.out.println(replaceAll);
		
		System.out.println(userInput.length());
		
		
		//char Valuea = 'a';
		
		int value_a = 'a';
		
		int value_z = 'z';
		
		int value_A = 'A';
		
		int value_Z = 'Z';
		
	
		
		                      //17
		for(int i = 0 ; i < userInput.length() ; i++) {
			
			//System.out.println(userInput.charAt(i));
			
			// convert userInput.charAt(i) to number//
			
			int numInput = userInput.charAt(i);
			
	//"a1b2c34d098098efg"    //97                  122
			if(numInput >= value_a && numInput <= value_z) {
				
				System.out.print(userInput.charAt(i));
			}
			              //65                      //90
			if(numInput >= value_A && numInput <= value_Z) {
				
				System.out.print(userInput.charAt(i));
				
			}
		}

//		
//		System.out.println(value_a);// 97
//		
//		System.out.println(value_z);// 122
//		
//		System.out.println(value_A);// 65
//		
//		System.out.println(value_Z);// 90
//		
//		
		// Print out number only
		
//		int value_0 = '0';
//		
//		int value_9 = '9';
//		
//		for(int i = 0 ; i < userInput.length();i++) {
//			
//			//System.out.println(userInput.charAt(i));
//			
//			int numInput = userInput.charAt(i);
//			
//			if(numInput >= value_0 && numInput <= value_9 ) {
//				
//				System.out.print(userInput.charAt(i));
//			}
//		}
//		
//		System.out.println(value_0);//48
//		System.out.println(value_9);//57
		
	}//end method

}//end class
