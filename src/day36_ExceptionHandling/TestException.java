package day36_ExceptionHandling;

public class TestException {

	public static void main(String[] args) throws TechcircleException  {
		

//		
//        String str = "Techcircle";
//		
//		System.out.println();
//		
		
		try {
			test();
		} catch (Exception e) {
			
			e.printStackTrace();
			
			//e.print("Do your homework");
		
		}
		test();
		
}//end main method

	
	
	public static void test() throws TechcircleException{
		
		String str = "Techcircle";
		
		throw new TechcircleException();
		
		
	 }
}
