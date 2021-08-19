package day09_LoopReview;

public class ASCII_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for (int i = 97 ; i < 123; i++) {
//			
//			char letter = (char)i;
//			
//			System.out.println(letter);
//			
//		}
//		
//		
		
		
		char A ='A';
		
		char Z ='Z';
		
		int num   = A ;
		int num2  = Z ;
		
		System.out.println(num);
		System.out.println(num2);
		
		for(int i = num; i <= num2 ;i++) {
			
	//	System.out.println(i);	
			
			char letter =(char) i;
			
			System.out.println(letter);
			
			}
		
	}//end method

}//end class
