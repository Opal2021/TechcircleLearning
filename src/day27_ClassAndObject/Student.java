package day27_ClassAndObject;

public class Student {

	// Instance Variables
	
	String name ;
	int    age ;
	char   gender;
	String color;
	
	
public Student(){}
	
	public void printInfo () {
		
	System.out.println("Student is "+name);
	System.out.println("Student is "+age);
	System.out.println("Student is "+gender);
	System.out.println("Student is "+color);
	
	}
	
public Student (String name , String color,int age,char gender) {

this.name =name ;
this.age = age;
this.gender = gender;
this.color = color ;	
	
}	
	
	
	
	public void eat() {
		System.out.println(name + " is eatting");
	}
	
	
	public void run() {
		System.out.println(name + " is running");
	}
	
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
