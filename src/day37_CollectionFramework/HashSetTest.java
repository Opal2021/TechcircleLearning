package day37_CollectionFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		
		Set <String> set2 = new HashSet<>();
		
		Collection <String> set = new HashSet<>();
		
		HashSet <String> set3 = new HashSet<>();
		
		set3.add("A");
		set3.add("A");
		set3.add("B");
		set3.add("C");
		set3.add("C");
		
		System.out.println(set3.size());
		
		System.out.println(set3);
		
		
		String arr[] = {"JAVA", "SQL","GIT","Jenkins","SQL","GIT","Jenkins","SQL","GIT","Jenkins"};
		
		HashSet <String> set4 = new HashSet<>();
		
		
		for( int i = 0 ; i < arr.length ; i++) {
			
			set4.add(arr[i]);
			
		}
		
		System.out.println(set4);
		
		//Add element to Array
		
		String arr2[] = new String[set4.size()];
		
		System.out.println(arr2.length);
		
		Iterator iterate = set4.iterator();
		
		int index = 0 ;
		
		while(iterate.hasNext()) {
			
			System.out.println(iterate.next());
			
			String element =(String) iterate.next();
			
			arr2[index] = element;
			
			index++;
		}
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		//=========================================================
		
		Set<Integer> a = new HashSet<Integer>(); 
		
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
       
        Set<Integer> b = new HashSet<Integer>(); 
        
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
		
	//======================================================================
        
        
        
      //Create a program to find unique character from a string
      	
        String str = "AAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
	
        
        Set<Character> hs = new HashSet<>(); 
        
        for(int i = 0 ;i< str.length();i++) {
        	
        	System.out.println(str.charAt(i));
        	hs.add(str.charAt(i));
        	
        }
        
        System.out.println(hs);
        
      //  System.out.println(hs.toString()); 
        
        String str2 = hs.toString();
        
        str2 = str2.replace("[", "");
        
        str2 = str2.replace("]", "");
        
        str2 = str2.replace(",", "");
        
        str2 = str2.replace(" ", "");
        
        System.out.println(str2.toLowerCase());
        
      }//end method

}//end class
