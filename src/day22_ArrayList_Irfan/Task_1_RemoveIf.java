package day22_ArrayList_Irfan;

import java.util.ArrayList;

public class Task_1_RemoveIf {

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
		names.add("Famira");
		names.add("Nadia");
		names.add("Mergan");
		names.add("Pedro");
		names.add("Elira");
		
//		Create list of names that ends with an letter a
		
		
		
		String name = "Mergen";
		
		System.out.println(name.endsWith("a"));
		System.out.println(name.charAt(name.length()-1));
		if (name.charAt(name.length()-1) == 'a') {
			
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0 ; i < names.size(); i++) {
			String name2 = names.get(i);
//			System.out.println(name2);
			
			
//			if (name2.charAt(name2.length()-1) == 'a') {
//				list.add(name2);
//			}
			
			
			if (name2.endsWith("a")) {
				list.add(name2);
			}
			
			
		}
		
		System.out.println(list);
		
		System.out.println(names);
		
		
		names.removeIf( item -> !item.endsWith("a"));
		
		
		System.out.println(names);
		
		
		
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		  
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
  
       
        
        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        
        
        Numbers.removeIf(n -> (n % 3 == 0));
  
        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
		
		
		
	}//

}//
