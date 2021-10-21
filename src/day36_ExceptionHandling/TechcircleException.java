package day36_ExceptionHandling;

public class TechcircleException extends Exception{

	public void print(String msg) {
	
		System.out.println(msg);
		
	}
	
	
	    public void print(Exception e) {
	    
	
	    e.printStackTrace();
	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
