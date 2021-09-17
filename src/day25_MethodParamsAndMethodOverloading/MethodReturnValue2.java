package day25_MethodParamsAndMethodOverloading;

public class MethodReturnValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add2Num(1,3);
		
		add3Num(1,2,3);
		System.out.println(add3Num(1,2,3));
		
		int result = add3Num(1,2,3) * 10;
		
		System.out.println(result);
		
		}//end method

public static void  add2Num(int num1 , int num2) {
	
	System.out.println(num1+num2);
	
   }

public static int  add3Num(int num1 , int num2,int num3) {
	
	//System.out.println(num1+num2);
	
	return num1 + num2 + num3;
   }


}//end class
