package day26_Tasks;

public class Task6_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		 verify if the string palindrome
//		    civic	
//		
		
		String word = "civic";
		
		System.out.println(reverseString(word));
		
		boolean check = isPalindrom(word);
		
		System.out.println(check);
		
		
}//end method
	
	
	
public static boolean isPalindrom (String input) {
	
	if(input.equals(reverseString(input))) {
		
       return true;
	}else
		
		return false;
	
	
}//
	
	
public static String reverseString(String str) {
	
	String reverseStr = "";
		
		for(int i = str.length()-1; i >= 0 ; i--) {

			reverseStr = reverseStr+ str.charAt(i);
		  
			//System.out.print(str.charAt(i));
		}
		return reverseStr;
	}	
	
      
}//end class
