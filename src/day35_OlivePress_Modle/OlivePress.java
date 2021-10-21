package day35_OlivePress_Modle;

import java.util.ArrayList;

public class OlivePress extends Olive{

	
	public int getOil(ArrayList <Olive>listOil ) {
	
		int total = 0;
		
		for(int i =0 ; i< listOil.size() ;i++) {
	     
			total += listOil.get(i).crush();	
		}
	      return total;
	
	
	}

	@Override
	public String getOrigine() {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
