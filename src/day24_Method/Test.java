package day24_Method;

public class Test {

	public static void main(String[] args) {
		

		String countxx = "hexxo thxxex xfyukxxx ";
		
		
		int count       = 0;
		
		for(int i = 0 ; i < countxx.length()-1;i ++) {
			
			if(countxx.substring(i, i+2).equals("xx")) {
				
				count++;
				
			}
		}
				
			System.out.println(count);
		
		
		

		
	}//end method


}//end class
