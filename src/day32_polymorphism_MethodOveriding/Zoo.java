package day32_polymorphism_MethodOveriding;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		

		Cat cat = new Cat();
		
		Dog dog = new Dog();
		
		Horse horse = new Horse();
		
		
//		test(cat);
//		test(dog);
//		test(horse);
		
	Animal a = new Cat();
	
	Animal b = new Dog();
	
	Animal c = new Horse();
	
//	a.walk();
//	a.makeSound();
//	
//	b.walk();
//	b.makeSound();
//	
//	c.walk();
//	c.makeSound();
//	
	
	ArrayList <Animal> animals = new ArrayList<>();
	
	
	animals.add(c);
	animals.add(b);
	animals.add(a);
	animals.add(dog);
	animals.add(cat);
	animals.add(horse);
	
	
	for( Animal animal : animals) {
		
		animal.makeSound();
		
		animal.walk();
		
	}
	
	
	
	
	
	
	
}//end Main Method
	
	public static void test(Animal c) {
		c.walk();
		
		c.makeSound();
	}
	
	
//	public static void test(Cat c) {
//		c.walk();
//		
//		c.makeSound();
//	}
//	
//	
//	
//	public static void test(Dog c) {
//		c.walk();
//		
//		c.makeSound();
//	}
//	
//	
//	
//	
//	public static void test(Horse c) {
//		c.walk();
//		
//		c.makeSound();
//	}
//	
//	
	
	
	
	
	
	
	
}
