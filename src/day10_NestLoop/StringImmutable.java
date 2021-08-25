package day10_NestLoop;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Techcircle";

		System.out.println(str.toUpperCase());// why put it in the garbage answer save some memory.

		System.out.println(str);

		String word1 = "Java";

		String word2 = "Hello";

		String word3 = "Hello Java";
		
		
		String word4 = word2 + word1;
		
		System.out.println(word4);
		
		// not work!!!!!!!!!
		
		boolean result = word4 == word3;
		
		System.out.println(result);// false
		
		
	}//end method

}//end class
