package day22_ArrayList_Irfan;

public class Homework_0Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Password validation
//
//	    1. 8 character at least
//	    2. there must be a digit            (isUpper   isLowercase)
//	    3. there must be a letter (at least one upper case & one lower case)
//	    4. there must be special character
		
		
		String password = "1234Lp&$0";
		
		String special ="[!@#$%&*()_+=|<>?{}\\[\\]~-]";
		
		boolean flag = false;
		
		if(password.length() >= 8) {
			
			
		for(int i = 0 ; i < password.length() ; i++) {
			
			char passwordChar     = password.charAt(i);
			String passwordString = String.valueOf(password.charAt(i));
			
			
			
			if(Character.isLetter(passwordChar)&&
			   Character.isDigit(passwordChar) &&
			   Character.isUpperCase(passwordChar) &&
			   Character.isLowerCase(passwordChar) ) {
			   
			  flag = true;
				
				for(int j = 0 ; j < special.length(); j++) {
					
					String specialString = String.valueOf(special.charAt(j));
					
					if(passwordString.contains(specialString)) {
				
						flag = true;
					}
				}
			}else
				flag = false;
		}
		
		}else
			
			System.out.println("Invalid");
		
		if(flag == true) {
			
			System.out.println("Valid Password");
		}else
			
			System.out.println("Invalid");
		
		// Irfan Method
		
		
		
		//System.out.println(Character.isAlphabetic(0));
		
		System.out.println(Character.isLetter('*'));
		System.out.println(Character.isDigit('*'));
		System.out.println(!Character.isLetter('*') && (!Character.isDigit('*')));
		
		String password1 = "Password@1";
		
		boolean hasDigit     = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		Boolean symbol = false;
		

		if (password.length() > 7) {

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if (Character.isDigit(ch)) {
					hasDigit = true;
					
				}
				if (Character.isUpperCase(ch)) {
					hasUpperCase = true;
				}
				if (Character.isLowerCase(ch)) {
					hasLowerCase = true;
				}
				if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
					symbol = true;
				}
			}
			if (hasDigit && hasUpperCase && hasLowerCase && symbol) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Password invalid");
			}
		} else {
			System.out.println("Password must be at least 8 characters long");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//

}//
