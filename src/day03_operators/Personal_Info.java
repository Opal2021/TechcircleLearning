package day03_operators;

public class Personal_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * variables: firstName, lastName, fullName, age, 
		 * gender, phoneNumber, SSN,weight,
		 * height
		 * output:
		 * full name is: YourFullName
		 * age is: YourAge years
		 *  gender is: your genderPhone Number is: YourPhoneNumberSSN is: YourSSN
			weight is: your weight
			
			height is: your height*/
		
		
		String firstName = "Paviga";
		
		String lastName  = "Klamkam";
		
		String fullName  = firstName  +  lastName;
		
		int age = 38;
		
		char gender = 'F';
		
		long phoneNumber = 403_671_8439L;
     
        long ssn = 1789078907L;  
        
        double weight = 55.5;
        
        int hight = 156;
        
        System.out.println("Fullname is : " +  fullName);
        
        System.out.println("Age is : " + age + " years ");
        
        System.out.println("Gender is : " + gender);
		
        System.out.println("Wight is : " + weight);
		
        System.out.println("Hight is : "+ hight);
        
	    System.out.println("SSN is : "+ ssn);
        
        
	    
	    // Find the average
	    
	    
	    int dogOne = 3;
		int dogTwo = 4;
		int dogThree = 5;
		float averageAge = (dogOne + dogTwo + dogThree) / 3;
		System.out.println("The average age of the three dogs is " + averageAge + ".");
		
		
		
		double a = 20 + (-3)* 5/8;
		int b= (55 +9)%9;
		
		System.out.println(b);
		
		
		
	}//end method

}//end class
