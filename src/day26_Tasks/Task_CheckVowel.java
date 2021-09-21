package day26_Tasks;

public class Task_CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         String hello = "Hlleeeeeeee";
		
		
		if (checkVowel(hello)) {
			System.out.println(hello +" contains vowel");
		}else {
			System.out.println(hello +" doesn't contains vowel");
		}	
		
		
	}//end method
	
	public static boolean checkVowel(String str) {
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
	
		boolean isVowel = false;
//		String str = "";
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
//			System.out.println(ch);
			if(ch == a || ch == e || ch == i || ch == o || ch == u) {
				isVowel = true;
			}
		
		}
//			System.out.println(isVowel);
			
			return isVowel;
	
	}
	
	
}//end class
