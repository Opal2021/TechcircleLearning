package day32_polymorphism_MethodOveriding;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.show();
		
		
		Child c = new Child();
		
		c.show();
		
		Parent p2 = new Child();// run time Polymorphism

		p2.show();
	}

}
