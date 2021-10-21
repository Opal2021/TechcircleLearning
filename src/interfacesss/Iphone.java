package interfacesss;

public class Iphone implements Alarm{

	
public void call() {
	
	System.out.println("Calling someone");
}

public void playGame() {
	
	System.out.println("Playing game");
}

@Override
public void setAlarm() {
	System.out.println("Its 6 AM");
	
}

@Override
public void sayHello() {
	System.out.println("Good evening");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
