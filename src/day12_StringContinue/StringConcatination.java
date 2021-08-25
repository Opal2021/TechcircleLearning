package day12_StringContinue;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";
		
//		String result = word1 + word2 + word3;
//		
//		System.out.println(result);
		
		String result = "";
		
//				result += word1; // "" + "re";
//				System.out.println(result);
//		
//				result += word2; // "re" + "think";
//				System.out.println(result);
//				
//				result += word3; // "rethink" + "ing";
//				System.out.println(result);
		
		
		
				
		int lenght = word1.concat(word2).length();
		
		result = word1.concat(word2).concat(word3).concat(" ").concat("Techcircle").concat(" ").concat("Ariuna");
		
		System.out.println(lenght);
		
		System.out.println(result);
		System.out.println(result.length());
				
				
		
//		5
//		
//		5 X 1 = 5;
//		5 X 2 = 10'
		
//		int num = 5;
//		
//		for(int i = 1 ; i <= num; i ++) {
//			
//			int total =  num * i;
//			
////			System.out.println(i);
////			System.out.println(total);
//			
////			5 X 1 = 5;
////			5 X 2 = 10'
//			
//			String msg = num + " X " + i+" = "+total
//					;
//			
//			System.out.println(msg);
//			
//			
		

	}//end method

}//end class
