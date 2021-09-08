package day13_StringTasks;

public class SubStringTask_emailSpit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  //      0123456789
        String email2 = "test@gmail.com";
		
		String email = "irfan.tursun@techcirclesolutions.org";
		
		// Extract username and domain name from email
		
		
//		String username = "irfan.tursun";
//		String domainName = "techcirclesolutions";
		
		String username1 = email.substring(0,email.indexOf("@"));
		
		//System.out.println(username1);
		
		//System.out.println(email.lastIndexOf("."));
		
		
		int startIndex1 = email.indexOf("@")+1;
		
		int endingIndex1 = email.lastIndexOf(".");
		
		String domainName1 = email.substring(startIndex1, endingIndex1);
		
		System.out.println(domainName1);
		
		
		
		
		String email3 = "pkklamkam@gmail.com";
		
		
		
        String username = email3.substring(0,email3.indexOf("@"));
		
		System.out.println(username);
		
		System.out.println(email3.lastIndexOf("."));
		
       
		int startIndex = email3.indexOf("@")+1;
		
		int endingIndex = email3.lastIndexOf(".");
		
		String domainName = email3.substring(startIndex, endingIndex);
		
		System.out.println(domainName);
		
		
		
		
		
	}

}
