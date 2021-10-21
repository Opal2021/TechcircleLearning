package day32_polymorphism_.webdrivers;

public class Square extends Shape{

 double side ;
 
 public Square() {
	 
	 super("Square");
 }
	
	
	
	public Square(double side) {
	super();
	this.side = side;
}



	@Override
	public double getArea() {
		
		return side * side;
	}
	
	
	
	
	
}
