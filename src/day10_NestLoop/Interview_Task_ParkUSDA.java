package day10_NestLoop;

import java.util.Iterator;

public class Interview_Task_ParkUSDA {

	public static void main(String[] args) {
		
		//method1
//		for (int i = 1 ; i <=100 ; i++) {
//			
//			if (i%3 == 0 && i%5==0) {
//				System.out.println("TechCircle");
//			}
//			if (i%3 == 0 ) {
//				System.out.println("Tech");
//			}
//			if (i%5==0) {
//				System.out.println("Circle");
//			}
//			if (i%3 != 0 && i%5!=0) {
//				System.out.println(i);
//			}
//			
//		}
		
	
		
		
		// method2
		for (int i=1 ; i <= 100 ; i++) {
			
			String printThis = "";
			
			if (i%3 == 0) {
				printThis = "Tech";
			}
			
			if (i%5 == 0) {
				printThis = printThis.concat("Circle");
			}
			
			if(printThis.equals("")) {
				
				System.out.println(i);
			}else
				System.out.println(printThis);
			
			
		}

		
		//Park method
		
		try {
		       int userNum = 77;
		
				String printThis = "";
				
				if (userNum % 3 == 0) {
					printThis = "US";
				}
				if (userNum % 5 == 0) {
					printThis = printThis.concat("DA");
				}
				
				if (printThis.equals("")) {
					System.out.println("The number is not divisible");
				}else
					System.out.println(printThis);
				
				
				} catch (Exception e) {
					System.out.println("Invaild");
				}
	} // end main

} // end class

