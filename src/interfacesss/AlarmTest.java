package interfacesss;

import java.util.ArrayList;

public class AlarmTest {

	public static void main(String[] args) {
	
		
	Alarm a = new Iphone();
		
	Alarm b = new Clock();	
		
	Alarm c = new Alexa();	
		
		

	ArrayList <Alarm>	list = new ArrayList <Alarm>();
		
		
	list.add(c);	
		
	list.add(b);	
		
	list.add(a);	
		
	for (Alarm alarm : list)	{
		
		alarm.setAlarm();
		alarm.sayHello();
		
		
	}
		
		
		
		
		
		

	}

}
