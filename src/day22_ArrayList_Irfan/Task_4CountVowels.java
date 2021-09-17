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
		String sentence = "The utility package contains all the classes and interfaces";	
		
		char[] charSentence = sentence.toCharArray();
		
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		
		char thirdVowel = ' ';
		
		int numOfVowels = 0;
		
		boolean ifFound = true;
		
		for (int i = 0; i < charSentence.length; i++) {
			while (numOfVowels < 3) {
				for (char x : vowels) {
					if (x == charSentence[i]) {
						numOfVowels++;
						break;
					}
					if (numOfVowels == 3) {
						thirdVowel = charSentence[i];
					}
				}		
			}
		}
		
		int count =0;
		
		for(char x: charSentence) {
			if(thirdVowel == x) {
				count++;
			}
		}
		
		System.out.println("Third vowel is "+thirdVowel);
		System.out.println("occurs "+count+" times");
	}//

}//
