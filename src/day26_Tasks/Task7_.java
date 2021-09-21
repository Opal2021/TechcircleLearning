package day26_Tasks;

public class Task7_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		takes a sentence and word, then returns the frequency of the word
//	    input "Hello java"
//	    looking for "hello"
//	    output: 1 time

	    String str = "Hello java";
	    
	    String word [] = str.split(str);
	    
	    int count = 0;
	    
	    String target = "";
	    
	    for (int i = 0 ; i < str.length(); i++) {
	    
	         if(target.equals(word)) {
	         
	         count ++;
	         
	    }
	    
	}
	    
	    System.out.println(count);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
