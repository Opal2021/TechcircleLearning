package day33_Abstract.Cars;

public abstract class Car {

	String brand,model, color;
	
	double price;
	
	int year;
	
	public Car () {}

	public Car(String brand, String model, String color, double price, int year) {
		
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + ", year=" + year
				+ "]";
	}
	

	public abstract void start();
	
	
	
	
	
	
}
