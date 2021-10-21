package day37_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_LlnkedList {

	public static void main(String[] args) {
		
	//LinkedList <String>	list = new LinkedList <String>();
	
	//List <String>	list = new LinkedList <String>();
		
	//Collection <String>	list = new LinkedList <String>();//Can not use get method
	
	Queue <String>	list = new LinkedList <String>();
	
	list.add("Apple");
	list.add("Pear");	
	list.add("Orange");	
	list.add("Pineapple");	
		
	for ( int i = 0 ; i <list.size(); i++)	{
		
	//	System.out.println(list.get(i));
		
	}
		
//	Iterator i = list.iterator();
//	
//	while (i.hasNext()) {
//		
//		System.out.println(i.next());
//	}

	//==================================================================
	
	
	//Write a program to find out longest fruit name
	
	
	int max = 0;
	
	String longest= " ";
	
	for(String L :list) {
		System.out.println(L);
		
		int count = L.length();
		
//		for(int i =0;i<L.length();i++) {
//			count++;
//		}
		if(max<count) {
			max=count;
			longest=L;
		}
		
	}
	System.out.println("longest is "+longest);
	
//===============================================================
	
	
	//Create list of integers by using collection interface
	
	Collection <Integer> numbers = new ArrayList<>();
	
	numbers.add(1);
	numbers.add(100);
	numbers.add(30);
	
	
	//find the largest and smallest number from the numbers list
	
	System.out.println(Collections.max(numbers));
	
	System.out.println(Collections.min(numbers));
	
	
	// ==================================================================
	 
	
	LinkedList<String> list1 =new LinkedList<String>();
	 
 //Adding elements to the Linked list
	 
	 
     list1.add("Steve");
     list1.add("Carl");
     list1.add("Raj");

     //Adding an element to the first position
     list1.addFirst("Negan");

     //Adding an element to the last position
     list1.addLast("Rick");

     //Adding an element to the 3rd position
     list1.add(2, "Glenn");

   
     //Iterating LinkedList
    
     Iterator<String> iterator = list1.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
	
	list1.remove(1);
	list1.remove(1);
	
	System.out.println(list1);
		
	System.out.println(list1.isEmpty());//false
	
	list1.clear();
	
	System.out.println(list1);
	
	System.out.println(list1.isEmpty());
	
	}//end method

}//end class
