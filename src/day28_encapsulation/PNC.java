package day28_encapsulation;

public class PNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BankAccount ac = new BankAccount();
	
	ac.accountName = "Ariuna";
	
	ac.accountNumber = "6989067086";
		
	ac.showBalance();	
		
	ac.deposit(10000);	
		
	ac.showBalance();		
		
	ac.withdraw(5000);	
		
	ac.getInfo();	
		
		
		
		
		
		
		
	}

}
