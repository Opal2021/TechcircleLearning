package day28_encapsulation;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Credentials c = new Credentials();
		
		System.out.println(c.getUserName());
		System.out.println(c.getPassword());
		
		c.setUserName("hgiuphivhfeiurhv;k");
		c.setPassword("Password$");
		
		System.out.println(c.getUserName());
		System.out.println(c.getPassword());
		
		
		
		
		
		
		
	}

}
