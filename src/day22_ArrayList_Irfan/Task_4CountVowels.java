package day22_ArrayList_Irfan;

public class Task_4CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//String sentence = "The utility package contains all the classes and interfaces";
		
		
		//count the number of vowels in this string.	
		
	//****************************************************************************	

		//String sentence = "The utility package contains all the classes and interfaces";
		
		//Find the third vowel, and count how many times it occurs in the string
		// i : 4
//11:30
//String sentence = "The utility package contains all the classes and interfaces";
		//String sentence2 = "ASCII stands for American Standard Code for Information Interchange."; // i : 6
		
		//Find the third (non-unique) vowel, and count how many times it occurs in the string
		// i : 4	
		
//		
		String str = "Welcome to TechCircle";

		String volwels = "aeiou";

		char thirdVowel = ' ';

		int numOfVowels = 0;

		//System.out.println("Third vowel is " + thirdVowel);

		// Finding the third vowel: e

		for (int i = 0; i < str.length(); i++) {

			char eachChar = str.charAt(i);

//			System.out.println(eachChar);

			if (volwels.contains(Character.toString(eachChar))) {

				numOfVowels++;

				if (numOfVowels == 3) {
					System.out.println("I Found my third volwel" + eachChar);
					thirdVowel = eachChar;
				}

			}

		}

//		System.out.println(thirdVowel);

		// How many times does the third vowel occur in the string
		int count =0;

		for (int i = 0; i < str.length(); i++) {

			char eachChar = str.charAt(i);
			
			if (eachChar == thirdVowel) {
				count++;
			}
			
			
			
		}
		
		System.out.println("Third vowel <"+thirdVowel+"> occur in the string "+count+" times");
		
	}//

}//
