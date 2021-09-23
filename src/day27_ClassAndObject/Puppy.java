package day27_ClassAndObject;

public class Puppy {

	// Assigning values to class variables using constructor
	
	int age;
	String name;
	
	public Puppy(){}
		
		public void printInfo () {
			
		System.out.println("Name of the puppy is"+ name+","+age+"year old");
		}
		
	public Puppy (String name , int age) {
	
	this.age = age;
	this.name = name;
	
		
	
		
	}
	
	
	
	
	
	
	
	
}//end class
