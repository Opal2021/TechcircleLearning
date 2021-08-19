package day03_operators;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Task-1
//		CalculateRectangle.    
//		Write a program that can calculate the area & perimeter of any rectangle.
//		Task-2
//		DVM car registration card   
//		Write a program to describe your drivers license card using primitive variables.
//		Capture all the data on your Drivers license, and print them on your console. 
//
//		Note you don't have to use your real information. 
//		
		//Task1
		
	    int length = 15;
		
		int width  = 9;
		
		int area   = length * width;
		
		System.out.println("Area of rectangle is " + area);
		
		System.out.println();
		
		//Task2
		
		long Id             = 1789078907L;
		
        String firstName    = "Opal"; // non primitive
		
		String lastName     = "Klamkam"; // non primitive
		
		String address      = "35 Grandview place calgary AB T2M2E3"; // non primitive
	
		String eyes         = "BRO"; // non primitive
		
		String endorsement  = "NONE"; // non primitive
		
		String dateOfBirth  = "09/99/1999"; // non primitive
		
		String exp          = "08/88/2008"; // non primitive
		
		String issOri       = "02/22/2002"; // non primitive
		
		char sex            = 'F';
		
		char classD         = 'D';
		
		int restictions     = 9;
		
		double height       = 5.3;
		
		
		System.out.println("Customer identifier" + " \n" + Id);
		
		System.out.println();
		
		System.out.println("Name" + "\n" +  lastName +"\n" + firstName);
		
		System.out.println();
		
		System.out.println("Address" +"\n" + address);
		
		System.out.println();
		
		System.out.println("Sex" +"\t"+ "Class"+"\t\t"+ "Date of birth");
		
		System.out.println(sex +"\t"+ classD +"\t\t"+ dateOfBirth);
		
        System.out.println("Eyes" +"\t"+ "Endorsement"+"\t"+ "Iss ORI");
		
		System.out.println(eyes +"\t"+ endorsement +"\t\t"+ issOri);
		
        System.out.println("Height" +"\t"+ "Restrictions"+"\t"+ "Exp");
		
		System.out.println(height +"\t"+ restictions +"\t\t"+ exp);
		
		
		
     
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
	}//end method

}//end class

