package day26_Tasks;

public class Task1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		returns the frequency of given char ( premitive) sfrom the given string, as int
//	    accept one string, one character... return number of characters
//	    //String str = "hello";
//	     * char a = 'e';
//	     * output 1
//		
		
         String str = "hello";
		
		int count =  0;
		
		for (int i = 0 ;i < str.length(); i++) {
			
			char a = ' ';
			
			for(int j = i+1 ;j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j)) {
					
					a = str.charAt(i);
					
					
					
					count++;
					
				}
				
				System.out.println(a);
			}
			
			
				
				
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end method

}//end class
