package day12_StringContinue;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "Hello Java";
	
	System.out.println(str.length());//10
	
	str = str.trim();
		
    System.out.println(str.length());
		
		
    String str2 = "Hello Java       ";

	System.out.println(str2.length());// 17

	str2 = str2.trim();

	System.out.println(str2.length());// 10

	String str3 = "                                Hello Java       ";

	System.out.println(str3.length());// 

	str3 = str3.trim();

	System.out.println(str3.length());// 10

		}

}
