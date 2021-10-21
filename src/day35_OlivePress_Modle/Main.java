package day35_OlivePress_Modle;

import java.util.ArrayList;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		
		
	//Olive o1 = new Olive("Cerignola", "Green", 5);
	
	//Olive o2 = new Olive("Picholine", "Light Green", 3);
		
		
	// Abstract
		
		Kalamata o1 = new Kalamata();
		
		Kalamata o2 = new Kalamata();
		
		Ligurian o3 = new Ligurian();
		
		Ligurian o4 = new Ligurian();
		
	ArrayList <Olive>	listOil = new ArrayList <Olive>();
		
		
	listOil.add(o2);	
		
	listOil.add(o1)	;
	
	listOil.add(o3);	
	
	listOil.add(o4)	;
	
	listOil.add(new Ligurian())	;//another way
		
//	Iterator<Olive> it = listOil.iterator();	
//		
//	while(it.hasNext()) {
//		
//		System.out.println(it.next());
//	}
//		
	for(int i =0 ; i< listOil.size() ;i++) {
		
		System.out.println(listOil.get(i).getName());

		//System.out.println(listOil.get(i).name);
	}
		
	OlivePress press	= new OlivePress();
	
	//press.getOil(listOil);
	int totalOil = press.getOil(listOil);
	System.out.println("Amount of olive oil collected is "+totalOil);
	}

}
