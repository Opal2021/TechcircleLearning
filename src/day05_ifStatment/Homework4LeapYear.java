package day05_ifStatment;

public class Homework4LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find if the given year is leap year
//		*
//		 Create a class called LeapYear, and write a program that can identify if the given i
//		s Leap Year, print true if it’s a leap year, otherwise print false
//		Ex:
//		year = 2020
//		output:
//		2020 is a leap year: true
//		Hint: if the number of year can be evenly divisible by 4, it’s known as a leap year

		int inputYear    = 2020;
		
		boolean leapYear = true;
		boolean noLeapYear = false;
		
		
		
		if(inputYear % 4 == 0) {
			
			System.out.println(leapYear);
			
		}else
			
			System.out.println(noLeapYear);
		
		
		
     }//end method

}//end class
