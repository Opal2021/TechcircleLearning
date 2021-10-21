package day33_Abstract.Cars;

public class Toyota extends Car {

	
public Toyota () {}
	
	public Toyota( String model, String color, double price, int year) {
		
	super("Toyota",model,color,price,year)	;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void start() {
		
		System.out.println("Insert your key and twist it");
	}

}
