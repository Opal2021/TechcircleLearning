package day32_polymorphism_.webdrivers;

public class ChromeDriver extends WebDriver{

	public void get(String url) {
		
		System.out.println("Navigating to"+ url+ "on chrome driver");	
			
		}
		
		
		public void findElement() {
			
			System.out.println("Locating the webElement on chrome driver");
		}
		
		 public void getPageSource() {
			
			System.out.println("Getting page source code on chrome driver");
		}
		
		 public void close() {
		
		System.out.println("Closing the chrome driver");
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
