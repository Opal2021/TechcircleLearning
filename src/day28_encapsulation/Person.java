package day28_encapsulation;

import java.time.LocalDate;

public class Person {

private String name ;
private int age ;
private char gender;
private LocalDate dob;
private String ssn;


public Person(String name, int age, char gender, LocalDate dob, String ssn) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.dob = dob;
	this.ssn = ssn;
}


public Person() {}


public void printInfo (Person x) {
	System.out.println(x.getName());
	System.out.println(x.getage());
	System.out.println(x.getGender());
	System.out.println(x.getDOB());
	System.out.println(x.getSSN());
	
	
	
	
}

//************(Getter)***********************
public String getName () {
	
	return this.name;
}
public int getage () {
	
	return this.age;
}

public char getGender () {
	
	return this.gender;
}
public LocalDate getDOB () {
	
	return this.dob;
}

public String getSSN () {
	
	return this.ssn;
}


//*************(Setter)************************

public void  setName (String name ) {
	
	 this.name = name;
}


public void  setAge (int age ) {
	
	 this.age = age;
}
	
public void  setGender (char gender ) {
	
	 this.gender = gender;
}


public void  setDOB (LocalDate dob ) {
	
	 this.dob = dob;
}
public void  setSSN (String ssn ) {
	
	 this.ssn = ssn;
}
	
	
	
}//
