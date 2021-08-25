package day12_StringContinue;

public class Find_IndexOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name = "President George Washington";
	
	System.out.println(name.indexOf('P'));
		
	System.out.println(name.indexOf('e'));
		
	System.out.println(name.indexOf("George"));	
		
	System.out.println(name.indexOf('e',3));	
		
	System.out.println(name.indexOf("Bob"));	
		
	System.out.println(name.indexOf('e'));	
		
	System.out.println(name.lastIndexOf('o'));	
	
	
	
	System.out.println(name.length()-1);
		
	System.out.println(name.charAt(name.length()-1));
	
	System.out.println(name.lastIndexOf('e'));
	
	System.out.println(name.length()); //27
	
	System.out.println(name.charAt(26));
	
	System.out.println(name.charAt(name.length()-1));
	
	
	
	}//end Method

}//end Class
