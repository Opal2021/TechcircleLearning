package day03_operators;

public class RelationalOperatior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*write a program that can calculate the salary after tax based on the salary
		 * 
		 * and tax rate 
		 * Ex:if salary = 100000 
		 * taxRate = 0.28 
		 * totalTax = salary * taxRate;
		 * salary after tax = salary - totalTax
		 *  
		 * */
		
			
			int salary = 100000;
			
			double taxRate = 0.28;
			
			double totalTax = salary * taxRate;
			
			double netIncome = salary - totalTax;
			
			
			System.out.println("Total tax paid "+ totalTax);
			
			System.out.println("Net income "+ netIncome);

        //    techcircle  10:05 PM
          int numA = 3;
		int numB = 3;
		int numC = 6;
		
		boolean result = numA == numB;
		
		System.out.println(numA == numB);
		
		System.out.println(result);
		
		
		boolean result2 = numA == numC;
		
		System.out.println(result2);
		
		
		boolean result3 = numA+numB == numC;
		
		System.out.println(result3);
		
		
		
		// not equal !=
		
		
		System.out.println(numA != numB); // false
		
		System.out.println(numA != numC);
		
		
		
		
		System.out.println();
		






		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
