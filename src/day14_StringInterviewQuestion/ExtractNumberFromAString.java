package day14_StringInterviewQuestion;

public class ExtractNumberFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
         String str = "ab123456cde78d";
		
		//Write a program to extract number from a string. 
		
//		expected output : 12345678
		
		String num = "0123456789";
		
		for(int i = 0 ;i < str.length(); i++) {
		//	System.out.println(i);
	
			
			String currentNum = Character.toString(str.charAt(i));
					
			if (num.contains(currentNum)) {
			System.out.print(currentNum);
			}	
			
		}
		
		//elira method
		
		//if(str.charAt(i) > 48 && str.charAt(i)< 57) {
			
		//	System.out.println(str.charAt(i));
		
		
		
		//Opal Method
		
		
		

		
		
		
	}

}
