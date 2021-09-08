package day17_ArrayContinue;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String task = "write a program that can print out the unique number from the array of integers";
		
		int spacecCount =  0;
		
//		int length = task.length();
		
//		if (task.contains(" ")) {
//			System.out.println("Found the space");
//		}
		
		char letters[] = task.toCharArray();
		
		for(int i = 0 ; i < letters.length; i++) {
			System.out.println(letters[i]);
			
			if (letters[i] == ' ') {
				spacecCount++;
			}
			
		}
		
//		System.out.println(spacecCount);
		
		
		int wordCount = spacecCount+1;
		
		System.out.println("Number of word is "+wordCount);
		
		
		
//		String arr[] = task.split(" ");
//		
//		
//		System.out.println("Number of word is "+arr.length);
//		
//		for(int i = 0 ; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
	String arr[] = task.split("the");
		
		
		System.out.println("Number of word is "+arr.length);
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
