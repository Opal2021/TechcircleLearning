package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopingArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Darima");
		
		names.add("Opal");
		
		names.add("Dina");
		
		names.add("Zamira");
		
		names.add("Ariuna");
		
		names.add("Erkin");
		
		names.add("Qasir");
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		System.out.println(names.get(6));
		
		
		
		for(int i = 0 ; i <names.size(); i++) {
		
		System.out.println(names.get(i));
		
	}
		System.out.println("================================");	
	
		int count = 0;
		
		while(count < names.size()) {
			
			System.out.println(names.get(count));
			
		}
		System.out.println("================================");	
	
		do {
			System.out.println(names.get(count));
			count++;
			
			break;
			
		}while(count < names.size());
		
		System.out.println("================================");	
		
		for(String name : names) {
			
			System.out.println(name);
		}
		
	System.out.println("================================");	
		
		
	// work for collection
	
	Iterator<String> iterator = names.iterator();
	
	iterator.next();
	iterator.next();
	iterator.next();
	iterator.next();
	iterator.next();
	iterator.next();
	
	System.out.println(iterator.next());

	System.out.println(iterator.hasNext());
	
	
	while(iterator.hasNext()) {
		
		System.out.println(iterator.next());
	}
	
	
	
	}//

}//
