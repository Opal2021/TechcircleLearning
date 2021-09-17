package day25_MethodParamsAndMethodOverloading;

public class Task2_CalculateGrade {

	
	//2. create a function that can calculate the grade of the student
	
	
            public static void main(String[] args) {
	
            String resultGrade = (studentGrade('A'));
             
            	System.out.println(resultGrade);
            	
            	
            	
     }  //end method
	
	
	public static String studentGrade (char grade) {
		
		//char grade = 'F';
       
		String printThis = "";
        
        switch(grade) {
        
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        printThis = "Pass";
        break;
        case 'W':
        printThis ="Withdraw";
        break;
        case 'I':
        printThis = "Incomplete";
        break;
        default:
        printThis = "Fail";
      
        }
        return printThis;
	}
	
	
	
}//end class
