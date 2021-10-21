package day31_polymorphisimPerson;

public class Developer extends Employee{
	
public Developer(String name,int age,char gender,double hourlyRate,String jobId) {
		
		super(name,age,gender,hourlyRate,jobId,"SDET");
	 
		
	}
	
	
public void debugging()	{
	
	System.out.println(name + " is devugging application");
	
}
	
	
public void developpingNewFunctionality()	{
	
	System.out.println(name + " is developping new functionality");
	
}
	
public void buildAndDeployApplication()	{
	
	System.out.println(name + " is buliding and deploy Application");
	
}	
	
//Overriding


public void work () {
	
	System.out.println(name + "is developping");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
