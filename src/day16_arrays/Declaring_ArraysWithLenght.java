package day16_arrays;

public class Declaring_ArraysWithLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int scores [] = new int [5];
		
		scores [0] = 1;
		
		scores [1] = 2;
					
		scores [2] = 3;
		
		scores [3] = 4;
		
		scores [4] = 5;
		
	//	int scores [] = {1,2,3,4,5};
		
		scores[3] = scores [0] + scores [4];
		
		System.out.println(scores [0]);
		System.out.println(scores [1]);
		System.out.println(scores [2]);
		System.out.println(scores [3]);
		System.out.println(scores [4]);
		
	String months [] = new String[12];
	
	
	months[0] = "January";
	
	months[1] = "Febuary";
	
	months[2] = "March";
	
	months[3] = "April";
	
	months[4] = "May";
	
	months[5] = "June";
	
	months[6] = "July";
	
	months[7] = "August";
	
	months[8] = "September";
	
	months[9] = "October";
	
	months[10] = "November";
	
	months[11] = "December";
	
	System.out.println(months[0]);
	System.out.println(months[1]);
	System.out.println(months[2]);
	System.out.println(months[3]);
	System.out.println(months[4]);
	System.out.println(months[5]);
	System.out.println(months[6]);
	System.out.println(months[7]);
	System.out.println(months[8]);
	System.out.println(months[9]);
	System.out.println(months[10]);
	System.out.println(months[11]);
	
	
	String cars [] = {"Volvo","BMW","Ford","Mazda"};
	
	System.out.println(cars[0]);
	
	System.out.println("Cars at Element 1." +cars[0]);
	System.out.println("Cars at Element 2." +cars[1]);
	System.out.println("Cars at Element 3." +cars[2]);
	System.out.println("Cars at Element 4." +cars[3]);
	
	}//

}//
