package interfacesss;

import java.time.LocalTime;

public class Clock implements Alarm{

	public void ShowCurrentTime () {
		
		System.out.println(LocalTime.now());
	}

	@Override
	public void setAlarm() {
		System.out.println("Set alarm at 4 PM");
	}

	@Override
	public void sayHello() {
		System.out.println("Good afternoon");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
