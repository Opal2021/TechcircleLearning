package day18_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReviewArraysListWithPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ARRAYLIST*********
		// ArrayList Review: Add, Set(replace), Remove, clear, size. to Print ==> get ()

		ArrayList <Integer> num = new ArrayList <Integer> (Arrays.asList(11, 22, 33));
		// num.add(0 , 11);
		// num.add(1 , 22);
		// num.add(2 , 33);

		num.set(1, 44);
		num.remove(0);
		// num.clear();
		
		System.out.println(num.size());

		//****for each **********

		// for (int listNum: num) {
		// System.out.println(listNum);
		// }
		int maxNum = 0 ;

		for (int i = 0; i < num.size(); i++) {
		
			//System.out.println(num.get(i));
		if (num.get(i) > maxNum) {
		  
			maxNum = num.get(i);
		}
		}
		System.out.println("The maximum number is: " + maxNum);


		// *****Add array into arrayList*********
		//**find unigue**
		
		String fruits [] = {"orange", "apple","strawberry","apple" };

		ArrayList <String> listFruits = new ArrayList <String> (Arrays.asList(fruits));
		
		listFruits.add("kiwi");
		
		//empty arrayList
		
		ArrayList <String> unique = new ArrayList <String> ();

		for (int i = 0; i < listFruits.size(); i++) {
		      
			if (!unique.contains(listFruits.get(i))) {
		      
				unique.add(listFruits.get(i));

		}
		}

		System.out.println("The unigue elements: "+ unique);	
		
		
	}//

}//
