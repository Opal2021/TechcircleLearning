package day32_polymorphism_.webdrivers;

public class Circle extends Shape{

	final double PI = 3.14;
	
	int radius ;
		
	public Circle () {
		super("Circle");
		
	}
	
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double getArea() {
		
		return PI * radius *radius;
	}
	
	

	
	
	
	
}
