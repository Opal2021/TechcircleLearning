package day32_polymorphism_MethodOveriding;

public class TestSchool {

	public static void main(String[] args) {
		
		School school = new School();
		
		school.location();
		
		System.out.println(school.name);
		
		
		Techcircle tc = new Techcircle();
		
		tc.location();
		
		
		School school1 = new Techcircle();
		
		school1.location();
		
		
		
		
	}

}
