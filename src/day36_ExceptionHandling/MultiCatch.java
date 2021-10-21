package day36_ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		String str = "Techcircle";
		
		char chars [] = str.toCharArray();
		
		try {
			System.out.println(str.charAt(0));
			
			System.out.println(chars[15]);
		
		} catch (StringIndexOutOfBoundsException e) {
			
			e.printStackTrace(); 
			
			System.out.println("String index problem");
		
        } catch (ArrayIndexOutOfBoundsException e) {
		
		    e.printStackTrace();
		    System.out.println("Array index problem");
	   
        }catch (Throwable e) {
		
		    e.printStackTrace();
		    
        }finally {
        	
        	System.out.println("Its always run Cleaning up");
        	//make sure you close everything
        }
	  
   // if you start with Throwable you dont need the rest
		//    because Throwable already handle everything
		// always smaller to larger
		//Throws use with Thread.sleep
		
		// Exception have 2 type
		// 1. Checked Exception --> Complie time
		//  Right Code  Ex. File or io exception -->io mean input and output
		
		//2. Unchecked Exception --> Run time
		//Ex. Out of bound / 0 divise
		
		//How do you handle Exception?
		//Ans Use Throws , Try/Catch and Finally
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
