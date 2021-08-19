package day06_SwitchStatement;

public class SelectBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String targetBrowser = "test";
		
		
		switch (targetBrowser) {
		
		case "Chrome" :
			// WebDriver driver = new ChromeDriver();
			System.out.println("Create instance of chrome browser");
			break;
			
		case "Edge" :
			System.out.println("Create instance of Edge browser");
			break;
			
			
		case "Safari":
			System.out.println("Create instance of safari browser");
			break;
			
		case "IE":
			System.out.println("Create instance of ie browser");
			break;	
		
		default:
		    System.out.println("Open Chrome if nothing found");
				
	
		}
		}		
}
		
