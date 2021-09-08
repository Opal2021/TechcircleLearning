package day14_StringInterviewQuestion;

import java.util.Scanner;

public class Home_2CountHowManyVowelsInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Count how many vowels are in a string
				//vowels: a, e, i, o, u
				//(example) String: elephant; number of vowels = 3
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		
		String input = scan.next();
		
		String uniquechars = "aeiou";
		
		
		int count = 0;
		
		for(int i = 0 ; i < input.length();i++) {
			
	
			String currentchars = Character.toString(input.charAt(i));
			
			
			if(uniquechars.contains(currentchars)) {
				
				count =count +1;
			}
			
		}
		
		System.out.println(count);
		
		
	}//

}//
