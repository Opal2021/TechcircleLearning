package day18_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String>animals= new ArrayList<>(Arrays.asList("dog","cat","rabbit","panda","pidgeon"));
		
	   int index = 0;
	   
	   String replaceWith = "bear";
		
		System.out.println(animals);
		
		for(int i = 0 ;i < animals.size() ; i++) {
	 		
			//System.out.println(animals.get(i));
	 		
			if (animals.get(i).equals("panda")) {
				
	 			System.out.println("panda is index " + i);
	 			
	 			index = i;
				
	 			
	 			 animals.set(index, replaceWith);
			}
	 		
	 	}
		
		
		
	}//

}//
