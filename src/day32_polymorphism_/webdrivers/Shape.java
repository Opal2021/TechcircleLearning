package day32_polymorphism_.webdrivers;

public abstract class Shape {

	String name;
	
	
	public Shape () {}

	public Shape(String name) {
		
		this.name = name;
	}
	
	public abstract double getArea ();
		
	

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
