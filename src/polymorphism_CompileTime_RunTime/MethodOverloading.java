package polymorphism_CompileTime_RunTime;

public class MethodOverloading {
	

		// Method overloading(Compile time) Class that contains
	    //more than one method with the same name. How to consider using which method?
		
	//There are 3 ways to consider which methods to be used.
	    
	    // 1. Number of parameter
		//2. Order of parameter
		// 3. Types of Parameter

		// no parameter
		public void findArea () {
		int a = 5;
		int b = 5 ;
		int sum = a + b;
		System.out.println("Total is: " + sum);
		}
		
		// number of parameter
		public void findArea (int para1, int para2) {
		int sum = para1 * para2;
		System.out.println("Total is: " + sum);
		}
		
		// Type of Parameter
		public void findArea (double para1, double para2) {
		double sum = para1 * para2;
		System.out.println("Total is: " + sum);
		}

		//Order of parameter
		public void findArea (int para1, double para2) {
		double sum = para1 + para2;
		System.out.println("Total is: " + sum);
		}
		public void findArea (double para1, int para2) {
		double sum = para1 * para2;
		System.out.println("Total is: " + sum);
		}
		//********************Main method starts here!!!!***********************************************************
		public static void main(String[] args) {

		MethodOverloading m1 = new MethodOverloading();

		// m1.findArea();
		//
		// m1.findArea(500,500);
		//
		// m1.findArea(5000.00, 100.00);
		m1.findArea(10.5, 5 );

		} // end main

		} // end class


