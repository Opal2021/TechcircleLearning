package day32_polymorphism_.webdrivers;

public class Rectangle extends Shape{

	double length,width;
	
	public Rectangle () {
		
		super ("Rectangle");
	}

	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}



	

	@Override
	public double getArea() {
		return length * width ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
