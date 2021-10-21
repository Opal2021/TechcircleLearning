package polymorphism_CompileTime_RunTimeMethodOverriding;

public class UserObject {

	public static void main(String[] args) {
		

		User u1 = new User();
		
		u1.login();
		u1.create();
		u1.benefits();
	
		
       User u2 = new Student();
		
		u1.login();
		u1.create();
		u1.benefits();
	
		
		
       User u3 = new Teacher();
		
		u1.login();
		u1.create();
		u1.benefits();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
