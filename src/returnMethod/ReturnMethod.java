package returnMethod;

public class ReturnMethod {

	public static void main(String[] args) {
// Access modifier 
//		Java provides four types of access modifiers or visibility specifiers	
//	Private:   The access level of a private modifier is only within the class. 
//		       It cannot be accessed from outside the class.
//  Protected: The access level of a protected modifier is within the package 
//		       and outside the package through child class. If you do not make the child class, 
//		       it cannot be accessed from outside the package.	
//	Public:    The access level of a public modifier is everywhere. 
//		       It can be accessed from within the class, outside the class, 
//		       within the package and outside the package.	
//	Default: The access level of a default modifier is only within the package. 
//		     It cannot be accessed from outside the package. 
//		     If you do not specify any access level, it will be the default.	
//		
// ready to use by dont have to create an object
// No return		
		// Return Method have 2 types
		
		//1. can return 2. can not return
		
	//Can not return
		
		printThis();
		
		int total = totalsum();
		
		System.out.println(total);
		
		
        int totalAddme = addMe(10, 20);
		
		System.out.println(totalAddme);//first way
		
		System.out.println(addMe(10, 20));//second way

		
		String inputName = name("FuqTaaddd");
		
		System.out.println("my name is: " + name("Park"));//first way
		
		System.out.println("my name is: " + inputName);//second way
		
		
		
		
		checkAge(55);
		
//		double moneyInputDollar    = 3;
//		
//		double thaiBaht            = 33.3;
//		
//		double result              = moneyInputDollar * thaiBaht;
//		
//		
	
		double result2 = conveter(54);
		
	       System.out.println(result2);
	       
	       int sum1 = totalsum();
	      
	       System.out.println(sum1);
		
		
	}//end main method

// same class need "static" and can not return
public static void printThis () {
	
	System.out.println("This is from printThis Method, but in the same method class");
}

// This one can return
// You need  return type  and name to return the method and word "return" 
// you need to sysout in main method

public static int totalsum () {
	
	int sum = 1+1;
	
	return sum;
}

public static int addMe (int a , int b) {
    
	int sumNum = a+b ;
    
	return sumNum;
}

public static String name (String x) {
    
	String myName = x;
    
	return myName;
}
// void can not return
public static void checkAge(int age) {
	
	if(age >= 18) {
		System.out.println("You in");
	}else
		System.out.println("you out");
	
}

public static double conveter(double moneyInputDollar ) {
	
	
	double thaiBaht            = 33.3;
	
	double result              = moneyInputDollar * thaiBaht;
	
	return result;
	
}

}//end class
