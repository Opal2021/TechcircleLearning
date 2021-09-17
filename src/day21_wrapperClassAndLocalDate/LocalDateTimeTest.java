package day21_wrapperClassAndLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// At Time (hour/min/sec)
		
		
		LocalDate today = LocalDate.now();
		
		LocalDateTime now = today.atTime(9, 24);
		
		System.out.println(now);
		
		//OR you cando it in 1 line.
		
		
		LocalDateTime now1 = LocalDateTime.now();
		
		System.out.println(now1);
		
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

		System.out.println(now1.format(df));

		System.out.println(now1.format(tf));
		
		System.out.println(now1.format(dtf));
		
		
		//Find out which day were you born? ( name of the day)
		
		LocalDate bornDate = LocalDate.of(1983, 7, 7);
		
		DateTimeFormatter day = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		
		System.out.println(bornDate.format(day));
		
		
		
		
		System.out.println(today);
		
		
		System.out.println(today.getMonthValue());
		
		int month1 = today.getMonthValue();
		
		int month2 = bornDate.getMonthValue();
		
		int day1   = today.getDayOfMonth();
		
		int day2   = bornDate.getDayOfMonth();
		
		if(month1 == month2 && day1 == day2) {
			
			System.out.println("Happy Birth Day");
			
		}else
			System.out.println("Its not your BD");
		
		
		
	}//

}//
