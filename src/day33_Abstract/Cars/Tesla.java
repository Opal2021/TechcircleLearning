package day33_Abstract.Cars;

public class Tesla extends Car {

	
public Tesla () {}
	
	public Tesla( String model, String color, double price, int year) {
		
	super("Tesla",model,color,price,year)	;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void start() {
		System.out.println("Place your phone and press your brreak");
		
	}

}
