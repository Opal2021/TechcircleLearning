package interfacesss;

import java.time.LocalTime;

public class Alexa implements Alarm{

	public void alexaWhatTimeIsIt() {
		
		System.out.println("Its" + LocalTime.now());
	}

	@Override
	public void setAlarm() {
		System.out.println("Its 2 AM");
		
	}

	@Override
	public void sayHello() {
		System.out.println("Good morning");
		
	}
	
	
	
	
	
	
	
	
	
}
