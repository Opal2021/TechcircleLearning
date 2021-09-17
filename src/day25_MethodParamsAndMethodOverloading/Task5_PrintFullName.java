package day25_MethodParamsAndMethodOverloading;

public class Task5_PrintFullName {

	public static void main(String[] args) {
		//5.  write a method that can print out the full name of a person in regular format
        //ex:
         //  fullName("teChCirCle", "SCHOOL");
           //	output:
           	//	"Techcircle School"
           		
		System.out.println(formatFullname("teChCirCle", "SCHOOL"));
		
		
	}//end method
	
	public static String formatFullname(String firstName, String lastName ) {
	
	//String firstName = "teChCirCle";
	//String lastName  = "SCHOOL";
	
	firstName = firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
	
	System.out.println(firstName);
	
	lastName = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
	
	System.out.println(lastName);
	
	String fullName = firstName +" "+ lastName;
	
	//System.out.println(fullName);
	
	
	return fullName;
	
	}
	
}//end class
