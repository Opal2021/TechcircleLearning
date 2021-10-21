package day31_polymorphisimPerson;

public class Tester extends Employee{

	public void  executeSmokeTest () {
		
		System.out.println(name + "Running smoke test");
		
	}
	
	
	
    public void  executeRegressTest () {
		
		System.out.println(name +"Running Regression test");
		
	}
	
	
    public void  executeTestCase () {
	
	System.out.println(name + "is Creating test case");
	
}
	
	public Tester(String name,int age,char gender,double hourlyRate,String jobId) {
		
		super(name,age,gender,hourlyRate,jobId,"SDET");
		
		
	}
	
	//Overriding
	
public void work () {
		
		System.out.println(name + "is testing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
