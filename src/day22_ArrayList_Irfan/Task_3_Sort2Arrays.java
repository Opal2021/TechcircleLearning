package day22_ArrayList_Irfan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_3_Sort2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a 2D ArrayList with 2 rows such that the the first row is a list of people
		//second row is a list of the city each person lives in
		
		//Brian, Karen, Graham
		//Fairfax, Ashburn, Reston
		
		
		//Brian, Graham, Karen
		//Fairfax, Reston, Ashburn
		
		
		//Sort the 2d ArrayList by name of person
		
	ArrayList <ArrayList <String>> address2D = new ArrayList ();
	
	
		
		
	ArrayList <String>  name  = new ArrayList <String> (Arrays.asList("Brian","Karen","Graham"));
		
	ArrayList <String>  city = new ArrayList <String> (Arrays.asList("Fairfax","Ashburn","Reston"));
		
		//System.out.println(name.get(0));
		//System.out.println(city.get(0));
		
		//System.out.println(address2D.get(0));
	
	Collections.sort(name);
	
	
		
		address2D.add(name);
		address2D.add(city);
		
		
		
		System.out.println(address2D);
		
		
		
	}//

}//
