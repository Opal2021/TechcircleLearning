package day32_polymorphism_.webdrivers;

public class FireFoxDriver  extends WebDriver{

public void get(String url) {
		
		System.out.println("Navigating to"+ url+ "on firefox browser");	
			
		}
		
		
		public void findElement() {
			
			System.out.println("Locating the webElement on firefox browser");
		}
		
		 public void getPageSource() {
			
			System.out.println("Getting page source code on firefox browser");
		}
		
		 public void close() {
		
		System.out.println("Closing the firefox browser");
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
