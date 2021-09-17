package day22_ArrayList_Irfan;

import java.util.Arrays;

public class Homework_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a program that can return the sum of all the digits from a string
//	            ex:
//	                input: “a1b2c3”
//	                output: 6
//	                    (1+2+3= 6)
//	                input: “Today’s date is 04/27/2020"
//	                output: 17
//	                    (0+4+2+7+2+0+2+0=17)
		
		
		
		String sentence = "Today’s date is 04/27/2020";
		
		String num      = "0123456789";
		
		String sentence1 = "";
		
		int total        = 0;
		
		for(int i = 0 ; i < sentence.length() ;i ++) {
			
			//System.out.println(sentence.charAt(i));
			
			// convert char to String
			 sentence1 = String.valueOf(sentence.charAt(i));
			
			for(int j =0 ; j < num.length(); j++) {
				
				String sentence2 = String.valueOf(num.charAt(j));
			//	compare String & String
				if(sentence1.contains(sentence2)) {
					
				int numberSentence1 = Integer.parseInt(sentence1);
					
					total += numberSentence1;
				}
			}
		}
		          System.out.println(total);
		
		
		
		
		
	}//

}//
