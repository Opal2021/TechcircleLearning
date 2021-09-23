package day27_ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student john = new Student();
		
		john.name = "John";
		john.age = 12;
		john.color = "Fair";
		john.gender ='M';
		
		john.eat();
		john.sleep();
		john.run();
		
		
Student sophia = new Student();
		
	    sophia.name = "sophia";
		sophia.age = 10;
		sophia.color = "Fair";
		sophia.gender ='F';
		
		sophia.eat();
		sophia.sleep();
		sophia.run();
		
		
Student    lily = new Student();
		
		lily.name = "lily";
		lily.age = 11;
		lily.color = "Dark";
		lily.gender ='F';
		
		lily.eat();
		lily.sleep();
		lily.run();	
		
		
		
	ArrayList <Student>	 batch8 = new ArrayList<>();
	Student s1	 = new Student("Opal","brown",38,'F');
	Student s2	 = new Student("Erila","brown",38,'F');
	Student s3	 = new Student("Dina","brown",38,'F');	 
	Student s4	 = new Student("Farima","brown",38,'F');	
	Student s5	 = new Student("Darima","brown",38,'F');	
	Student s6	 = new Student("Ariana","brown",38,'F');	
	Student s7	 = new Student("Pedro","brown",38,'F');
	Student s8	 = new Student("Qasir","brown",38,'F');
	Student s9	 = new Student("Erkin","brown",38,'F');	 
	Student s10	 = new Student("Zamira","brown",38,'F');	
	
	batch8.add(s1);
	batch8.add(s2);
	batch8.add(s3);
	batch8.add(s4);
	batch8.add(s5);
	batch8.add(s6);
	batch8.add(s7);
	batch8.add(s8);
	batch8.add(s9);
	batch8.add(s10);

	
for (int i = 0; i < batch8.size(); i++) {
	batch8.get(i).sleep();
	batch8.get(i).printInfo();
	
}
	
	
	}//

}//
