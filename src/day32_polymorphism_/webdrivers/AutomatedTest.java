package day32_polymorphism_.webdrivers;

public class AutomatedTest {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("www.techcircleschool.com");
		
		driver.getPageSource();
		
		driver.findElement();
		
		driver.close();
		
		System.out.println("==========================");
		
      WebDriver driver2 = new FireFoxDriver();
		
		driver.get("www.techcircleschool.com");
		
		driver.getPageSource();
		
		driver.findElement();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
