package day27_ClassAndObject;

import java.util.ArrayList;

public class DogObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Assigning values to class variables using object	
		
Dog dog1 = new Dog();
		
		dog1.breed = "Neapolitan Mastiff";
		dog1.size = "Large";
		dog1.age = 5;
		dog1.color ="Black";
		
		dog1.eat();
		dog1.sleep();
		dog1.run();
		dog1.sit();

Dog dog4 = new Dog("Neapolitan Mastiff","Large",5,"black");
		
dog4.eat();
dog4.sleep();
dog4.run();
dog4.sit();
	
dog4.printInfo();
		
Dog dog2 = new Dog();
		
		dog2.breed = "Maltese";
		dog2.size = "Small";
		dog2.age = 2;
		dog2.color ="White";
		
		dog2.eat();
		dog2.sleep();
		dog2.run();
		dog2.sit();
			
	
Dog dog3 = new Dog();
		
		dog3.breed = "Chow chow ";
		dog3.size = "Midium";
		dog3.age = 3;
		dog3.color ="Brown";
		
		dog3.eat();
		dog3.sleep();
		dog3.run();
		dog3.sit();
		
		
		Dog dog5 = new Dog("Chihuahua","Small",5,"brown");			
		Dog dog6 = new Dog("Bullgog","Midium",4,"white");	
		Dog dog7 = new Dog("Sheepdog","Miduim",1,"white");
		Dog dog8 = new Dog("Dalmation","Large",5,"blackandwhite");
		Dog dog9 = new Dog("Doberman","Large",5,"black");
		Dog dog10 = new Dog("Pit Bull","Large",5,"black");
	//create ArrayList of dog,
		
ArrayList<Dog> dogs  = new ArrayList<>();
		
dogs.add(dog1);		
dogs.add(dog2);			
dogs.add(dog3);			
dogs.add(dog4);			
dogs.add(dog5);			
dogs.add(dog6);			
dogs.add(dog7);			
dogs.add(dog8);			
dogs.add(dog9);			
dogs.add(dog10);			
		
		for(Dog dog : dogs) {
			
			System.out.println(dog.breed);
			dog.eat();
		}
		
		
	}

}
