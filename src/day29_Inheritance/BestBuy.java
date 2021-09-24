package day29_Inheritance;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TV tv = new TV("DDH468759","Sumsang","XL75","Korea",899,false,true);
	
//tv.toString();

    System.out.println(tv.toString());
		
    tv.turnOn();		
		
    tv.turnOff();		
		
	tv.channelUp();	
		
	tv.channelDown();	
	
		
		
Phone phone = new Phone("Iphone","Apple","13","USA",999,true,true);
		
		phone.turnOn();	
		
		phone.call(null);
		
		phone.text(null);
		
	    phone.turnOff();	
	
	    phone.toString();	
		
	}

}
