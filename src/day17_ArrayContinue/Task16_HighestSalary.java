package day17_ArrayContinue;

import java.util.Arrays;

public class Task16_HighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Who has the highest salary?
//				
		String[] employeeNames = {"Nadia", "Darima", "Erkin" , "Opal", "Farima"};
//				        // index numbers:      0        1          2       3         4
//
         int[] employeeSalary = {1000000, 110000, 105000, 120000, 125000};
				 /*
				            Opal : $100000
				               ....
				           who has the highest salary
				           who has the minimum salary
				         */
          int highestPosition = 0;
          
          int lowestPosition  = 0;
		
          int highestSalary   = 0;
          
          int minSalary       = employeeSalary[0];
          
          int indexEmp        = 0; 
          
          for(int i = 0 ; i < employeeSalary.length; i ++) {
        	  
        	 // System.out.println(employeeSalary[i]);
        	  
        	  if(employeeSalary[i] > highestSalary ) {
        		  
        		  highestSalary   = employeeSalary[i] ;
        		  
        		  highestPosition = i;
        		  
        		  indexEmp        = highestPosition;
        	  }
        	  
        	  
          }
          System.out.println(highestSalary + " is  the highest salary");

          System.out.println(employeeNames[indexEmp] + " has the highest salary");

          
          for(int i = 0 ; i < employeeSalary.length; i ++) {
        	  
         	 // System.out.println(employeeSalary[i]);
         	  
         	  if(employeeSalary[i] < minSalary ) {
         		  
         		 minSalary     = employeeSalary[i] ;
         		  
         		lowestPosition = i;
         		  
         		  indexEmp     = lowestPosition;
         	  }
         	  
         	  
           }
           System.out.println(minSalary + " is the lowest salary");

           System.out.println(employeeNames[indexEmp] + "  has the lowest salary");

			
		
		//// Irfan Method
           
           int max = 0;
//   		
//   		int A = 100; 
//   		
//   		int B = 20;
   		
   		
//   		if (A > B) {
//   			max = A;
//   		}
   		
//   		System.out.println(max);
   		
   		
   		int position  = 0;
   		int maxSalary = 0;
   		
   		for(int i = 0 ; i < employeeSalary.length; i++) {
   			
   			if (employeeSalary[i] > maxSalary) {
   				maxSalary = employeeSalary[i];
   				
   				position = i;
   			}

   			
   		}
   		
   		System.out.println(employeeNames[position]+" is earning $"+ employeeSalary[position]);
   		


	}//

}//
