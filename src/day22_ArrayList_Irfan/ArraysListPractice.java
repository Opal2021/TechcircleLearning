package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList <String>	names = new ArrayList<>();
	
	names.add("Elira");
		
	names.add("Mergen");	
		
	names.add("Famira");	
		
	System.out.println(names.size());	
		
	System.out.println(names.get(2));	
		
	System.out.println(names.get(1));	
		
	System.out.println(names.get(0));	
		
	
	
	names.remove(0);
	names.remove(0);
	
	System.out.println(names.size());	
	
//  System.out.println(names.get(1));	
		
	System.out.println(names.get(0));	
		
		
	names.add("Dina");
	
	names.add("Hannah");
	
	
	System.out.println(names.get(2));	
	
	System.out.println(names.get(1));	
		
	System.out.println(names.get(0));	
		
	
	names.add("Zamira");
	
	names.add("Nadia");
	
	
	System.out.println(names.get(4));
	
	names.set(0, "Pedro");
	
	System.out.println(names.get(0));
	
	
	names.set(0, "Pedro".toUpperCase());
	
	System.out.println(names.get(0));
	
	
	ArrayList <String>	fruits = new ArrayList<>();
	
	fruits.add("Banana");
	fruits.add("Apple");
	fruits.add("Peach");
	fruits.add("Blackberry");
	fruits.add("Grape");
	
	System.out.println(fruits.get(0));	
	
	System.out.println(fruits.get(1));	
		
	System.out.println(fruits.get(2));	
	
	System.out.println(fruits.get(3));	
	
	System.out.println(fruits.get(4));	
	
		System.out.println(fruits);
		
		ArrayList <String>	fruits2 = new ArrayList<>(Arrays.asList("Banana","Apple","Peach","Blackberry","Grape"));	
		
		System.out.println(fruits2);
		
		System.out.println(fruits.get(0).equals(fruits2.get(0)));
		
		
	}//

}//
