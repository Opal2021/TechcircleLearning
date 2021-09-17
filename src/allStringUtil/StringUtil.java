package allStringUtil;

public class StringUtil {

	


	

	public static void reverseString(String str) {
		
		for(int i = str.length()-1; i >= 0 ; i--) {
//			System.out.println(i);
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
			
	
	}//end method reverseString
	
	             //boolean
     public static void checkPassword(String inputPassword) {
		
    	 String password = "inputPassword";
    		
    		boolean hasDigit     = false;
    		boolean hasUppercase = false;
    		boolean hasLowercase = false;
    		boolean hasLetter    = false;
    		boolean symbol       = false;
    		//boolean isValidPassword = false;
    		
    		if(password.length() >= 8) {
    			
    			for(int i =0 ;i < password.length() ;i ++) {
    				
    				char passwordChar = password.charAt(i);
    				
    				//System.out.println(passwordChar);
    				
    				if(Character.isDigit(passwordChar)) {
    					
    					hasDigit = true;
    				}	
    					
    				if(Character.isUpperCase(passwordChar)) {
    					
    					hasUppercase = true;
    				}
    			
    				if(Character.isLowerCase(passwordChar)) {
    		
    					hasLowercase = true;
    				}
    				
    				if(Character.isLetter(passwordChar)) {
    					
    					hasLetter = true;
    				}
    							
    				if(!Character.isDigit(passwordChar)&& !Character.isLetter(passwordChar)) {
    					
    					symbol = true;
    				}
    				
    				
    				}//end Loop
    				
    			if(hasDigit == true&&hasUppercase == true&&hasLowercase ==true&&hasLetter == true&&symbol==true) {
    					
    					System.out.println("Valid");
    					
    					//boolean = true;
    				}else
    					
    					System.out.println("Invalid");
    				
    				
    		}else
    			
    			System.out.println("Your password is less than 8");
    				 
     	             // return isValidPassword ;
    	 
           }//end method checkPassword	
		
public static void USDA (int number ) {
			
			try {
				
				for(int i = 1 ; i <= number ;i ++) {
					
					String printThis = "";
					
					if(i % 2 == 0) {
						
						printThis = "US";
						
					}
					if(i % 5 == 0) {
						
						printThis = printThis.concat("DA");
					}
					
					if(printThis.equals("")) {
						
						System.out.println(i);
						
					}else
						
						System.out.println(printThis);
				}
				
				
				
					} catch (Exception e) {
					
						System.out.println("Invalid");
				}
		
			
		}//end method USDA
		
public static String unique (String str) {
	
    String uniqueChars = "";
		
		
		for(int i = 0 ;i < str.length() ; i ++) {
			
			String currentChar = Character.toString(str.charAt(i));
			
           if (!uniqueChars.contains(currentChar)) {
           	
           
				
           	uniqueChars += currentChar;
				
			}
			
		}
		     return uniqueChars ;


  }//end method unique
		
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

}//end method formatFullname
		
//end class}
