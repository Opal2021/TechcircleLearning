package day06_SwitchStatement;

public class Multibranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double n1 = -1.0;
//		
//		double n2 = 4.5;
//		
//		double n3 = -5.3;
//		
//		
//		if(n1 > n2 && n1 > n3) {
//			System.out.println("The max number is" + n1);
//		}
//		
//		if(n2 > n1 && n2 > n3) {
//			System.out.println("The max number is" + n2);
//		}else
//			
//			System.out.println("The max number is" + n3);
//	
//	
	
	
		int num1 = 2;
		
		
		String Printthis = "";
			
				
					if(num1 == 1) {
						Printthis = "Monday ";
				
					} 
					else if(num1 == 2) {
						Printthis = "Tuesday ";
					}
					
					else if(num1 == 3) {
						Printthis = "Wednesday ";
					}
					
					else if(num1 == 4) {
						Printthis = "Thursday ";
					}
					
					else if(num1 == 5) {
						Printthis = "Friday ";
					}
					
					else if(num1 == 6) {
						Printthis = "Saturday ";
					}
					else if(num1 == 7) {
						Printthis = "Sunday ";
					}
					else
						Printthis ="Out of bound";
						
					System.out.println(Printthis);
				
		
		
		}//end method

}//end class
