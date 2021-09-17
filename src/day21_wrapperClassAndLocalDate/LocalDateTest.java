package day21_wrapperClassAndLocalDate;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		
		LocalDate tomorrow = date.plusDays(1);
		
		System.out.println(tomorrow);
		
		LocalDate yesterday = date.minusDays(1);
		
	    System.out.println(yesterday);
		
		LocalDate lastYearToday = date.minusYears(1);
		
		System.out.println(lastYearToday);
		
		System.out.println(date.isLeapYear());
		
		System.out.println(lastYearToday.isLeapYear());
		
		int year = date.getYear();
		
		System.out.println(year);
		
		
		LocalDate today = LocalDate.now();
		
		LocalDate expectDate = today.plusDays(2);
		
		System.out.println(expectDate);
		
		// LocalDate.of
		
		                         // After         7
		LocalDate ordersDate = LocalDate.of(2021, 8, 15);
		
		LocalDate policyDate = ordersDate.plusDays(30);
		
		LocalDate returnDate = LocalDate.now();
		
		
		
		
		if(returnDate.isBefore(policyDate)) {
			
			System.out.println("You can return your item");
		}else
			System.out.println("You can not return your item");
		
		
		System.out.println(returnDate);
		System.out.println(policyDate);
		System.out.println(returnDate.isAfter(policyDate));
		
		
	}//

}//
