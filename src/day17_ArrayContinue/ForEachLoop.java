package day17_ArrayContinue;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//??????????hash code = memory location
		
		
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		
		for(String i : cars) {
			
			System.out.println(i);
			
		}
		
		
        int nums [] = {10,20,30,40,50};
		
		for(int age : nums) {
			System.out.println(age);
			
		}
		
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
		
		for(String month : months) {
			System.out.println(month);
			
		}
		
	}//

}//
