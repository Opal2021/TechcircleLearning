package day26_Tasks;

public class Task4_UniqueAndReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	    removes the duplicates from the string and returns it
//        input:aabbcc
//    output: abc

	
		String str = "aabbcc";
		
		String uniqueChar = findUnique(str);
		
		System.out.println(uniqueChar);
	
	}//end method

	public static String findUnique (String strInput) {
		
         String unique = "";
		
		for(int i = 0 ;i < strInput.length(); i ++) {
		
		String currentChar = Character.toString(strInput.charAt(i));
		
		if(!unique.contains(currentChar)) {
			
			unique += currentChar;
			
		}
	}
		return unique;
	
		}
	
	}//end class
