package day32_polymorphism_.webdrivers;

public class WebDriver {

	String name, version;
	
	public WebDriver() {}

	public WebDriver(String name, String version) {
		
		this.name = name;
		this.version = version;
	}

	public void get(String url) {
		
	System.out.println("Navigating to "+ url);	
		
	}
	
	
	public void findElement() {
		
		System.out.println("Locating the webElement");
	}
	
	
   public void getPageSource() {
		
		System.out.println("Getting page source code");
	}
	
	
   public void close() {
	
	System.out.println("Closing the"+ name + "driver");
}
	
	
	
	
	
}
