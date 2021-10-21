package day31_polymorphisimPerson;

public class Person {

	String name;
	int age;
	char gender;
	
	public Person() {}
	
	public Person(String name,int age,char gender) {
	
	this.name = name;
	this .age = age;
	this.gender = gender;
	
}
	
	
	public void sleep() {
		
	System.out.println( name + " is eatting sleeping");	
		
	}
	
	public void eat() {
		
		System.out.println( name + " is eatting food");	
			
		}
		
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
