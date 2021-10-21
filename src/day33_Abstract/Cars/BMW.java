package day33_Abstract.Cars;

public class BMW extends Car{

	public BMW () {}
	
	public BMW( String model, String color, double price, int year) {
		
	super("BMW",model,color,price,year)	;
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void start() {
		System.out.println("Press the push button to start your BMW"+ model);
		
	}
	
	
	
	
	
	
	
	
	
	
}
