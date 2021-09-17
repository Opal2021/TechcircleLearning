package day21_wrapperClassAndLocalDate;

public class CharacterClassTestAndTaskExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	char a = 'A';
	
	char b = '9';
	
	Character  c = a;
	
	System.out.println(c);	
	
	System.out.println(c.charValue());
		
	System.out.println(Character.isDigit(b));
		
	System.out.println(Character.isDigit(a));	
		
		
	System.out.println(Character.isLetter(b));	
		
	System.out.println(Character.isLetter(a));		
		
		
		//extract letters from a string
	
	String str = "abc123def456";
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char eachChar = str.charAt(i);
			
			System.out.println(eachChar);
		
		   
			
		if(Character.isLetter(eachChar));
		
		 System.out.println(eachChar);
		
		
		
		if(Character.isDigit(eachChar));
		
		 System.out.println(eachChar);
		}
		
		
	}//

}//
