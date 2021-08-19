package day05_ifStatment;

public class Homework7DayAndWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		write program that can print out the name of the day based on the number 1 ~ 7
//		number = 1 // 1 ~ 7
//		output:
//		Monday
//		number = 5
//		output:Friday
//		
		
		
		int day = 2;
		
		String PrintThis = "";
		
		if(day >= 1 && day <= 7) {
		
		
				if (day == 1) {
					
					PrintThis = " Monday";
				}
				
		        if (day == 2) {
					
					PrintThis = " Tuesday";
				}
				
		        if (day == 3) {
			
			        PrintThis = " Wednesday";
		        }
				
		        if (day == 4) {
			
			        PrintThis = " Thursday";
		        }
				
				
		        if (day == 5) {
			
			        PrintThis = " Firday";
		        }
		        if (day == 6) {
			
			        PrintThis = " Saturday";
		        }
		        if (day == 7) {
			
			        PrintThis = " Sunday";
		        }
		}else 
		    	
        System.out.println("Its not the day of the week");
	        
	        System.out.println(PrintThis);
	        
	        
	        int numDay = 1;
	        
	        switch  (numDay) {
	        case 1 :
	        System.out.println("Monday");
	        break;
	        
	        case 2 :
		        System.out.println("Tuesday");
		        break;
	        
	        case 3 :
		        System.out.println("Wednesday");
		        break;
	        
	        case 4 :
		        System.out.println("Thursday");
		        break;
	        
	        case 5 :
		        System.out.println("Friday");
		        break;
	        case 6 :
		        System.out.println("Saturday");
		        break;
	        
	        case 7 :
		        System.out.println("Sunday");
		        break;
	        
	        default:
	    		
	    		System.out.println("Invalid ");
	    		break;
	        
	        }
	        
	   }//end method

}//end class
