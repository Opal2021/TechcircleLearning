package day32_polymorphism_.webdrivers;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		
		Shape triangle = new Triangle();
		
		triangle.getArea();
		
		System.out.println(triangle.name);
		
		////////////////////////////////

		Shape square = new Square();
		
		square.getArea();
		
		System.out.println(square.name);
		
		////////////////////////////////
		
        Shape circle = new Circle();
		
		System.out.println(circle.name);
		
		circle.getArea();
		System.out.println(circle.getArea());
	
		/////////////////////////////////////
		
		
		System.out.println("============================");	
		
		ArrayList<Shape> areaShape = new ArrayList<>();
		
		
		areaShape.add(circle);
		
		areaShape.add(square);
		
		areaShape.add(triangle);
		
		
		
		
		
		
		
		

	}

}
