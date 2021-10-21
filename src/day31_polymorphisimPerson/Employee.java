package day31_polymorphisimPerson;

public class Employee extends Person {

	
	boolean hasJob = true;
	
	double hourlyRate;
	
	String jobId ;
	
	String jobTitle;
	
	public Employee () {}
	
	public Employee (String name,int age,char gender,double hourlyRate,String jobId,String jobTitle) {
		
		super(name,age ,gender);
//		this.name = name;
//		this .age = age;
//		this.gender = gender;
		
		this.hourlyRate = hourlyRate;
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		
		
	}
	
	public void work () {
		
		System.out.println(name + "is working");
	}
	
	
	public double calculateSalary () {
		
		return 52 * 40 * hourlyRate;
		
		
	}

	@Override
	public String toString() {
		return "Employee [hasJob=" + hasJob + ", hourlyRate=" + hourlyRate + ", jobId=" + jobId + ", jobTitle="
				+ jobTitle + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
