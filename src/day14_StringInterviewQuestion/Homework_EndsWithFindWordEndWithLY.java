package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Homework_EndsWithFindWordEndWithLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Task4	
		
//		4- ask the user to enter a word.
//        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
//		
		
		System.out.println("Plese enter your word");
		
		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.next();
		
		//System.out.print(userInput.charAt(userInput.length()-2));
		//System.out.println(userInput.charAt(userInput.length()-1));
		
		int userInput1 = userInput.charAt(userInput.length()-2);
		
		int userInput2 = userInput.charAt(userInput.length()-1);
		
		if ( userInput1 == 108  && userInput2  == 121) {
			
			System.out.println("Really??");
			
	
		}else
			System.out.println("Never mine");
		
		
		
		//Irfan Method
		
		    
        String str4 = "lovely";
		
		
		String subString = str4.substring(str4.length()-2);
		
		System.out.println(subString);
		
		if(subString.equals("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
		
		if(str4.endsWith("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
	}//

}//
