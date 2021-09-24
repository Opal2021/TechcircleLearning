package day29_Inheritance;


// sup class

public class Phone  extends Device{

	static boolean canCall,canSendMessage,hasCamera;
	
	static {canCall = true;
	        canSendMessage = true;
	        hasCamera = true;
	        }
	
	public Phone() {}
	
	public Phone(String deviceName, String brand, String model, String madeIn, double price, boolean hasBattery,
			boolean hasPowerButton ) {
	
	
	setInfo(deviceName,brand,model,madeIn,price,hasBattery,hasPowerButton);
	
	}
	
	public void call(String phoneNumber) {
		
	System.out.println(deviceName + "" + model + "is texting"+phoneNumber);	
		
	}
	
	public void text(String phoneNumber) {
		
		System.out.println(deviceName + "" + model + "is texting"+phoneNumber);	
			
		}
	
	
	
	
	
	
	
}
