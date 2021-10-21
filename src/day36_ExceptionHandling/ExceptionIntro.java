package day36_ExceptionHandling;

import day31_polymorphisimPerson.Person;

public class ExceptionIntro {

	public static void main(String[] args) {
	
//	try {
//		
//	int a,b;
//	a = 7;
//	
//	b = 0;
//	System.out.println("Result : " + a/b);
//		
//	
//	} catch (Exception e) {
//		System.out.println("Invalid");
//		
//		e.printStackTrace();
//	}	
//		
//	System.out.println("Im here");	
//	
	
	try {
	String arr[]= {"Apple","Pineapple","Mango"};	
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1]);
		
		System.out.println(arr[2]);
		
		System.out.println(arr[3]);// does not exist
		
	}catch(Exception e) {
		
		System.out.println("OUT OF BOUND");
	}
		
		Person  p = new Person("Pedro" , 20,'M');
		
		p.eat();
		p.sleep();
		
		
		try {
			Person  p2 = null;
			
			
			p2.eat();
			p2.sleep();//It does not work
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Im here at the line number 54");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
