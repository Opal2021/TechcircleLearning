package day18_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArrayListStringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Arraylist String Type
		
	//way1	
		ArrayList<String> gfg = new ArrayList<String>();
		
		gfg.add("Geeks");
		
		gfg.add("for");
		
		gfg.add("Geeks");
		
		
		System.out.println("ArrayList : " + gfg);
		
	//way 2	
		ArrayList<String> gfg2 = new ArrayList<String>(Arrays.asList("Geeks","for","Geeks"));
		
        System.out.println(gfg2);
		
		
        
        
        List<Integer> arr = new ArrayList<>();
		
        arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		List<Integer> gfg3 = new ArrayList<Integer>(arr);
		
		System.out.println("ArrayList arr : "+arr);
		System.out.println("ArrayList gfg3 : "+gfg3);
	    System.out.println(arr);
	    

	    
	    
	    
	
	}//

}//
