package day26_Tasks;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Palindrome Check
		
//		
//		CIVIC
//		ANNA
		
		
		String str = "HANNAH";
		
		
//		if (str.equals(reverseString(str))) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
		
		
		System.out.println(isPalindrome("CIVIC"));
		
		System.out.println(isPalindrome("DINA"));
		
		
		System.out.println(isPalindrome("ANNA"));
		

	}//end method
	
	
	
	public static boolean isPalindrome(String str) {
		if (str.equals(reverseString(str))) {
//			System.out.println("Palindrome");
			return true;
		}else {
//			System.out.println("Not a Palindrome");
			return false;
		}
	}
	public static String reverseString(String str) {
//		String str = "TechCircle";
		
		String reversedStr = "";
		
		for(int i = str.length()-1; i >=0 ; i--) {
			reversedStr += str.charAt(i);
		}
		
		
		return reversedStr;
//		System.out.println(reversedStr);
//		
//		
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(str);
//		
//		System.out.println(sb.reverse());
		
	}
	
	

}//end class
