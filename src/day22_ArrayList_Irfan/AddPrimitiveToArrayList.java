package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;

public class AddPrimitiveToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Integer> scores = new ArrayList<>();
		
		scores.add(10);
		
		scores.add(20);
		
		scores.add(22);
		
		scores.add(33);
		
		System.out.println(scores.get(0));
		
		System.out.println(scores.get(0).doubleValue());
		
	// Create Character list and add digits & letters
		
		ArrayList <Character> digitsLetters = new ArrayList<>(Arrays.asList('1','2','3'));
		
		digitsLetters.add('a');
		digitsLetters.add('b');
		digitsLetters.add('c');
		digitsLetters.add('d');
		
		
//		
//		digitsLetters.add('1');
//		digitsLetters.add('2');
//		digitsLetters.add('3');
		
		System.out.println(digitsLetters);
		
		
		System.out.println(digitsLetters.get(0));
		System.out.println(Character.isDigit(digitsLetters.get(0)));//false
		
		System.out.println(digitsLetters.size());
		
		System.out.println(digitsLetters.get(5));
		
		System.out.println(digitsLetters.get(digitsLetters.size()-1));
		
		
		
		
		
	}

}
