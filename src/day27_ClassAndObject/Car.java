package day27_ClassAndObject;

public class Car {

	String brand;
	String model;
    String color;
	int    price;
	int    year ;
	
	public Car () {}
	
	public void carInfo () {
	
	System.out.println("The brand of car is "+ brand);	
	System.out.println("The model of car is "+ model);
	System.out.println("The color of car is "+color);
	System.out.println("The price of car is "+price);
	System.out.println("The year of car is "+year);
	}
	
	public Car (String brand,String model,String color,int price,int year) {
	
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.year = year;
	
	}
	
	
	
	public void driver() {
		
		System.out.println(brand + "driving");
	}
	
	public void stop() {
		
		System.out.println(brand +"stopping");
		
	}
	
	
	
	
	
	
	
}
