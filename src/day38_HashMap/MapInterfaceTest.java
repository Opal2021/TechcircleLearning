package day38_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceTest {

	public static void main(String[] args) {
		
		
		HashMap<String,String> phoneBook = new HashMap<String,String>();
		
		phoneBook.put("Dina", "571-123-3456");
		
		phoneBook.put("Hannah", "987-876-3459");
		
		phoneBook.put("Hannah", "987-876-3459");
		
		phoneBook.put("Pedro", "202-876-3459");
		
		phoneBook.put("Opal", "609-876-3459");
		
		System.out.println(phoneBook.get("Dina"));
		
		System.out.println(phoneBook.get("Hannah"));
		
		System.out.println(phoneBook.get("Opal"));
		
		
		HashMap<String,String> employee1 = new HashMap<String,String>();
		
		employee1.put("Employee_ID", "101");
		
		employee1.put("First_NAME", "STEVE");
		
		employee1.put("Last_NAME", "King");
		
		employee1.put("Salary", "24000");
		
		employee1.put("Hire_DATE", "17-JUN-03");

		
       HashMap<String,String> employee2 = new HashMap<String,String>();
		
		employee2.put("Employee_ID", "102");
		
		employee2.put("First_NAME", "Neena");
		
		employee2.put("Last_NAME", "Kochhar");
		
		employee2.put("Salary", "17000");
		
		employee2.put("Hire_DATE", "21-SEP-05");
		
		
		for(Map.Entry m : employee1.entrySet()){
			
			System.out.println(m.getKey()+ " "+ m.getValue());
		}

        for(Map.Entry m : employee2.entrySet()){
			
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		System.out.println("====================================");
		
		
//       Set sett = employee2.entrySet();// Converting to Set so that we can traverse
//       
//       Iterator it = sett.iterator();
//		
//		//Iterator it = sett.iterator();
//		
//		while (it.hasNext()) {
//			// Converting to Map.Entry so that we can get key and value separately
//			
//			Map.Entry entry = (Map.Entry) it.next();
//			
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//		
		
		
			HashMap<String,String> employee3 = new HashMap<String,String>();
			
			
			
			employee3.put("First_NAME", "STEVE");
			
			employee3.put("Last_NAME", "King");
			
			employee3.put("Salary", "24000");
			
			employee3.put("Department_name", "Executive");
		
		
			 HashMap<String,String> employee4 = new HashMap<String,String>();
				
			 employee4.put("First_NAME", "Neena");
				
			employee4.put("Last_NAME", "Kochhar");
				
			employee4.put("Salary", "17000");
				
			employee4.put("Department_name", "Executive");
			
				
		     HashMap<String,String> employee5 = new HashMap<String,String>();
					
		      employee5.put("First_NAME", "Lex");
					
			  employee5.put("Last_NAME", "De Haan	");
					
			  employee5.put("Salary", "17000");
					
			  employee5.put("Department_name", "Executive");
		
		
					for(Map.Entry m : employee3.entrySet()){
					
						System.out.println(m.getKey()+ " "+ m.getValue());
					}
		
					for(Map.Entry m : employee4.entrySet()){
						
						System.out.println(m.getKey()+ " "+ m.getValue());
					}
		
					for(Map.Entry m : employee5.entrySet()){
						
						System.out.println(m.getKey()+ " "+ m.getValue());
					}
		
		
		ArrayList<String> names = new ArrayList<String>();
		
		ArrayList<HashMap<String,String>> employees = new ArrayList();
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		System.out.println("---------------------------------------");
		
		for (int i =0 ;i < employees.size();i++) {
			
			
			for(Map.Entry m : employees.get(i).entrySet()){
				
				System.out.println(m.getKey()+ " "+ m.getValue());
			}
			
			System.out.println("--------------------------------------");
			
		}
		
		
		
		 HashMap<String,String> emp1 = new HashMap<String,String>();
		 
		 emp1.put("Employee_ID", "152");
			
		 emp1.put("First_NAME", "Peter");
				
		 emp1.put("Last_NAME", "Hall");
		  
		 emp1.put("Salary", "9000");
				
		 
         HashMap<String,String> emp2 = new HashMap<String,String>();
		 
		 emp2.put("Employee_ID", "150");
			
		 emp2.put("First_NAME", "Peter");
				
		 emp2.put("Last_NAME", "Tucker");
		  
		 emp2.put("Salary", "10000");
				
		
        HashMap<String,String> emp3 = new HashMap<String,String>();
		 
		 emp3.put("Employee_ID", "144");
			
		 emp3.put("First_NAME", "Peter");
				
		 emp3.put("Last_NAME", "Vargas");
		  
		 emp3.put("Salary", "2500");
				
		
		 ArrayList<String> empNames = new ArrayList<String>();
			
			ArrayList<HashMap<String,String>> emp = new ArrayList();
			
			emp.add(emp1);
			emp.add(emp2);
			emp.add(emp3);
			
			
			System.out.println("---------------------------------------");
			
			for (int i =0 ;i < emp.size();i++) {
				
				
				for(Map.Entry m : emp.get(i).entrySet()){
					
					System.out.println(m.getKey()+ " "+ m.getValue());
				}
				
				System.out.println("--------------------------------------");
				
			}
		
		
		
		
		
	}//end method

}//end class
