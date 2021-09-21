package day26_Tasks;

public class Task2_UniqueAndConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		returns the unique characters for the given string
//	    input:aabbcc
//	    output: abc
		
		int num = 123;
		
		String convertNum = String.valueOf(num);
		
		//===========================================
		
		String a = "123";
		
		int convertInt = Integer.parseInt(a);
		
		//===========================================
		
		
		
		
		String str = "aabbcc";
		
		String uniqueChar = findUnique(str);
		
		System.out.println(uniqueChar);
		
		
		
	}//end method

	public static String findUnique (String x) {
		
           String unique = "";
		
		
		for(int i = 0 ; i < x.length() ; i++) {
			
			//System.out.println(x.charAt(i));
			
			//String currentChar = Character.toString(str.charAt(i));
			String currentChar = String.valueOf(x.charAt(i));
			
			if (!unique.contains(currentChar)) {
				
				unique = unique +currentChar;
			}
	}
		
		return unique;
	}
	//System.out.println(unique);
	
	
}//end class
