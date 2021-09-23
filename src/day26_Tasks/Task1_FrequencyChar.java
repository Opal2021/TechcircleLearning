package day26_Tasks;

public class Task1_FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		returns the frequency of given char ( premitive) sfrom the given string, as int
//	    accept one string, one character... return number of characters
//	    //String str = "hello";
//	     * char a = 'e';
//	     * output 1
//		
		
        
		String word = "Hellook";

		char wordArr [] = word.toCharArray();

		int[] freq = new int[word.length()]; //6

		for (int i = 0; i < wordArr.length; i++) {
			
		        freq[i] = 1;
		
		           // System.out.println(word.charAt(i));
		
		for (int j = i+1; j < wordArr.length; j++) {
			
		      if(wordArr[i] == wordArr[j]){
		
			     freq[i]++;
                  
			     wordArr[j] = '0';
			     
		      }
		}
}

		for(int i = 0; i <freq.length; i++) {
		
			if(wordArr[i] != ' ' && wordArr[i] != '0')
		
				System.out.println(wordArr[i] + "-" + freq[i]);
		}
		
		
		
		
		
	
	}//end method
	
	
	

}//end class
