package day21_wrapperClassAndLocalDate;

public class WrapperClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Big to small if small to big no need to do it
		Integer a = 10;
		
		byte b = a.byteValue();
		
		// int 10 change to byte
		
		System.out.println(b);
		
		double d = a.doubleValue();
		
		System.out.println(d);
		
		long l = a.longValue();
	
//	***************************************	
	
		// convert String to int
		
		String num = "123";
		
		int value = Integer.parseInt(num);
	//              double.parsedouble	
		
		int result = value + 7 ;
		
		System.out.println(result);
		
//	*****************************************	
		
	
	   //convert result int to String
		
		
		num = Integer.toString(result);
		
		System.out.println(num.charAt(1));
		
//  *****************************************
	
		//Add 100 to the valueB , and assign the result to the str2;
		
		String str2 = "25";
		
		byte valueB = Byte.parseByte(str2);//Data Convert
		
		byte result2 = (byte) (valueB + 100);
		
		System.out.println(result2);
		
		str2 = Byte.toString(result2);
		
	//pedro method
		
        int result22 = valueB+100;
		
		str2 = Integer.toString(result22);
		
		System.out.println(str2);  
	
		
		
		
		
		
	}//

}//
