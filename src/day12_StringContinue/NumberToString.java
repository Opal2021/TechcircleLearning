package day12_StringContinue;

public class NumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num = 100;
		
		int num2 = num + 5;
		
		System.out.println(num2); //105
		
		String num3 = ""+num;
		
		System.out.println(num3);
		
		
		System.out.println(num3.length()); // 3
		
		System.out.println(num3.charAt(0));
//		               012
		String num4 = "100"; //3
		
		System.out.println(num3 + "5");
		
		
		double price = 10.99;
		
//		                             01234
		String price2 = price+"";  //10.99
		
		System.out.println(price2.length());//
		
		System.out.println(price2.indexOf('.'));
		
		
		System.out.println(price2.charAt(2));
		
		System.out.println(price2.charAt(price2.indexOf('.')));
		
		
		}

}
