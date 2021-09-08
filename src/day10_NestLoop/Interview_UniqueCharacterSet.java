 package day10_NestLoop;

public class Interview_UniqueCharacterSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aaaaaaaaabbbbbbbbbbccccccccc";
		
		//String expectedStr = "abc";
		
		String uniqueChars = "";
		
		
		for(int i = 0 ;i < str.length() ; i ++) {
			
			String currentChar = Character.toString(str.charAt(i));
			
            if (!uniqueChars.contains(currentChar)) {
            	
            	//       aabbcc
            	//"L"  = R
            	//abc
				
            	uniqueChars += currentChar;// uniqueChars = uniqueChars + currentChar
				
			}
			
		}
		       System.out.println(uniqueChars);
		
	}//end method

}//end class
