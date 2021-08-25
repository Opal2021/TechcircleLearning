package day10_NestLoop;

public class EmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "Java";
		
		String emptyString = "";
		
		String str = "Techcircle";
		
		System.out.println(word1.length());
		
		System.out.println(str.length());
		
		System.out.println(emptyString.length());
		
		//constructors
		
		String emptyString2 = new String();
		
		System.out.println(emptyString2.length());
		
		
		// Why we need to do  empty string?
		
		
		String word2 = new String("Java");
		
		
		System.out.println(word2);
		
		String word3 = new String("Java");
		
		System.out.println(word3);
		
		// This one 2 different location
		
		
		boolean result1 = word2 == word3;
		
		System.out.println(result1);
		
		
		//This one safe your memory
		
		
		String word4 = "Java";
		
		String word5 = word4;
		
        boolean result2 = word4 == word5;
		
		System.out.println(result2);
		
		
	}//end method

}//end class
