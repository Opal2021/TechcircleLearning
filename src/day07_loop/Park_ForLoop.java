package day07_loop;

public class Park_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 10;
//		
//		for(int i = 1 ; i <= num ; i++) {
//			//System.out.println(i);
//			if(i % 2 == 1 ) {
//				System.out.println(i + " = Odd number");
//				}
//		}
		
//		int sum = 0;
//		
//		
//		for(int i = 1 ; i <= 10 ; i++) {
//			
//		//	System.out.println(i);
//			
//			sum = sum +i;
//			
//		}
//		
//		System.out.println("Total is " + sum);
//		
//		
		//Task USDA
		
		for (int i = 1 ;i <= 100 ;i++) {

			String PrintThis = "";

			if(i % 2 == 0) {
			PrintThis = "US";

			}if(i % 5 == 0) {
			PrintThis = PrintThis.concat("DA");
			}

			// control printThis and (i)
			if(PrintThis.equals("")) {
			System.out.println(i);

			}else
			System.out.println(PrintThis);



			}


//		String word = "HelloWord";
//		System.out.println(word.length());
//		System.out.println(word.charAt(5));
//			
		
		
		
	}

}
