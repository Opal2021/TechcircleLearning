package day18_ArraysList;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Question Can you store primitive data type in collection?
		
		 // Answer No because collection take only non primitive data type and object.
		
	     //        and if you want to use it you need to do Autoboxing.
		
		
		
	// unboxing the object	
	// non primitive 	
		
	Integer i = new Integer(10)	;
	
	
	int i1 = i ;
	
	// i1 is a primitive integer with value 10
	
	
	
	System.out.println("Value of  i : " + i);
		
	System.out.println("Value of  i1 : " + i1);	
		
	
	
	boolean ok = false;
	
	Character gfg = 'a'	;
	
	gfg.toString();
	
	String name = "Jo";

	
	char ch = gfg ;
	
	System.out.println("Value of ch : " + ch);
	
    System.out.println("Value of gfg : " + gfg);
		
		
	}//end Method

}//end class
