package day06_SwitchStatement;

public class DaysOfTheWeekWithSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 2;
		String day = "";
		
		switch (input) {
		case 1:
//			System.out.println("Monday");
			day = "Monday";
			break;
		case 2:
//			System.out.println("Tuesday");
			day = "Tuesday";
			break;
		case 3:
//			System.out.println("Wednesday");
			day = "Wednesday";
			break;
		case 4:
//			System.out.println("Thursday");
			day = "Thursday";
			break;
		case 5:
//			System.out.println("Friday");
			day = "Friday";
			break;
		case 6:
//			System.out.println("Saturday");
			day = "Saturday";
			break;
		case 7:
//			System.out.println("Sunday");
			day = "Sunday";
			break;
		default:
			
			System.out.println("This is an invalid the day of the week");
			break;
		}
		
		
		System.out.println(day);
		
		
		}//end Method

}//end Class
