package day26_Tasks;

public class Task3_ReverseAndReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		 reverses the given string object and returns it
//		    input:abc
//		    output:cba
//		
		
		
		String  str = "abcdefg";
		
		String reverse = reverseString(str);
		
		System.out.println(reverse);
		
  }//end Method


public static String reverseString (String x) {
	
	String reverseStr = "";
	
	for(int i = x.length()-1 ; i > 0 ; i--) {
		
		reverseStr = reverseStr.concat( String.valueOf(x.charAt(i)));
		// System.out.println(x.charAt(i));
		
	}
	return reverseStr ;


}


}// end Class
