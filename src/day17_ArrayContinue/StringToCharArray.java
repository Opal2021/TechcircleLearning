package day17_ArrayContinue;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String str = "TechCircle";
		
		char letters[] = new char[str.length()];
		
		System.out.println(letters.length);
		
		System.out.println(Arrays.toString(letters));
		
		
//		letters[0] =  'T';
		letters[0] =  str.charAt(0);
		System.out.println(Arrays.toString(letters));
		
		for(int i = 0 ; i < str.length(); i++) {
			letters[i] =  str.charAt(i);
		}
		
		System.out.println(Arrays.toString(letters));
		
		
		char letters2[] = str.toCharArray();
		
		System.out.println(Arrays.toString(letters2));
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
