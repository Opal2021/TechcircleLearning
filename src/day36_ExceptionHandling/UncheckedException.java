package day36_ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		
	String str = "Welcome!"	;
		
	char[]	chars = str.toCharArray();
		
	try {
		for(int i = 0; i <= chars.length; i++)	{//no need =
			
			char c = chars[i];
			System.out.println(c);
			
			
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
		System.out.println("Out of Bounds");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
