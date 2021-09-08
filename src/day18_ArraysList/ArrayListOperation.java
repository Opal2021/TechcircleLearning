package day18_ArraysList;

import java.util.ArrayList;

public class ArrayListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list1 = new ArrayList<>();
		
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		ArrayList <String> list2 = new ArrayList<>();
//		list2.add("E");
//		list2.add("F");
		
		list2.add("E");
		list1.addAll(list2);// pick  collection!!!!!
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("list1 :" + list1);
		System.out.println("list2 :" + list2);
		System.out.println();
		

		
	/////////////////////////////////////////////////////////
		
		//pick the one that say int idex , collection is specifit where you want to put it.
		
		list1.addAll(2, list2);
		System.out.println(list1);
		
		
	////////////////////////////////////////////////////////	
		
		list1.set(2, "changed");
		
		System.out.println(list1);
		
		
	}//

}//
