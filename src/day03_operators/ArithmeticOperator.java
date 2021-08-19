package day03_operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//+ , - , * , / , % , ++, --
		
		int numA = 10;
		
		int numB = 2;
		
		int result = numA + numB;
		
		
		System.out.println(numA + numB);
		
		System.out.println(result);
		
		
	    System.out.println(numA - numB);
	    
	    System.out.println(numA * numB);
	    
	    System.out.println(numA / numB);
	    
	    
	    
	    int numC = numB + 1;
	    
	    System.out.println(numC);
	    
	    System.out.println(numA / numC);
	    
	    
	   //Modular operator %
	    
	   // 10 /3 = 3.333333
	    
	   // 10 = 3+3+3+1
	    
	    System.out.println(10 % 3);
	    
	    System.out.println(10 % 4); // 4+4+2
	    
	    System.out.println(10 % 9); // 9+1
	    
	    // increment ++
	    
	    int valueA = 1;
	    
	 //   valueA  =  valueA +1;
	    
	    
	  valueA++;
	  valueA++;
	  valueA++;
	   
	  
	    System.out.println(valueA);
	    
//	    valueA = valueA +1;

	valueA++;
	valueA++;
	valueA++;

	System.out.println(valueA);
	
	
	int valueB = 0;
	
	System.out.println(valueB++);
	System.out.println(valueB);// 1
	
	
	System.out.println(++valueB);//2
	
	
	//--
	int c = 5;
	
	c-- ;   // c = c -1
	c-- ;
	
	//System.out.println(c);9:34
    int a = 1;
	
	
	// prefix => ++a = a+1
	System.out.println(++a);
	
	int b = 1; 
	
	
//	postfix +> b++ 
	System.out.println(b++); // 1
	
	System.out.println(b); // 2
	
	//--
	
	//int c = 5;
	
	
	System.out.println(--c); //4
	
	System.out.println(c--); //4
	System.out.println(c); //3
	    
	    
		
//	    *write a program that can calculate the salary after tax based on the salary
//		 * 
//		 * and tax rate 
//		 * Ex:if salary = 100000 
//		 * taxRate = 0.28 
//		 * totalTax = salary * taxRate;
//		 * salary after tax = salary - totalTax
//		 *  
//		 * */
//		
			
			int salary = 100000;
			
			double taxRate = 0.28;
			
			double totalTax = salary * taxRate;
			
			double netIncome = salary - totalTax;
			
			
			System.out.println("Total tax paid "+ totalTax);
			
			System.out.println("Net income "+ netIncome);
		
		
		
		
		
		
		
		
	}//end method

}//end class
