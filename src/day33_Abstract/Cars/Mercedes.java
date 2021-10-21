package day33_Abstract.Cars;

public class Mercedes extends Car{

	public Mercedes () {}
	
	public Mercedes( String model, String color, double price, int year) {
		
		super("Mercedes",model,color,price,year)	;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void start() {
		
		System.out.println("Press the push button to start your Mercedes"+ model);
	}

}
