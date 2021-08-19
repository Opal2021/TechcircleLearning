package day05_ifStatment;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 50;
		
		char grade = 'u'; //default value then it will not compile
		
		// 0 <= score <= 100
		
		if (score >= 0 && score <= 100) {
			
			if(score >= 90 && score <=100) {
				grade = 'A';
				
			}else if(score >= 80 && score < 90) {
				
				grade = 'B';
			}else if(score >= 70 && score < 80) {
				
				grade = 'C';
			}else if(score >= 60 && score < 70) {
					
					grade = 'D';
			}else {
					grade = 'F';
					
			}		
			
		}else {
			
			
			System.out.println(" Invalid score");
		}
		
		System.out.println("Your score is <"+ score + "> grade is <"+ grade +">");
			
		
		
	}//end method

}//end class
