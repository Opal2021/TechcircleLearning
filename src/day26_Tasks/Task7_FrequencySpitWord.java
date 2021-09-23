package day26_Tasks;

import java.util.Arrays;


public class Task7_FrequencySpitWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		takes a sentence and word, then returns the frequency of the word
//	    input "Hello java"
//	    looking for "hello"
//	    output: 1 time

		
		
		String str = "Hello java world Hello";
		
		String wordArr [] = str.split(" ");
		
		
		
		int count     = 0 ;
		
		
		for(int i = 0 ;i < wordArr.length ; i++) {
			
		       for (int j = i+1 ; j < wordArr.length ;j++) {
				
				if(wordArr[i].equalsIgnoreCase(wordArr[j])) {
					
					count++;
			
		         System.out.println(wordArr[i]);

				}
		}
		
		
		
		
		}
		
		
//		int num = frequencyOfWord("hello java java" , "java");
//		
//		System.out.println(num);
//		
//		
	}//

//	public static int frequencyOfWord(String str, String lookingFor) {
//		String[] word1 = str.split(" ");
//		System.out.println(Arrays.toString(word1));
//		int count = 0;
//		for (String word : word1) {//for(int i =0 ; i < word1.length; i++)
//			
//		//	if(lookingFor.equals(word1[i]){
//			if (lookingFor.equals(word)) {
//				count++;
//			}
//		}
//		return count;
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}//
