package day05_ifStatment;

public class Homework10milk {

	public static void main(String[] args) {
		
	
		
//	//Boolean chekStoreFullFatMilk = false;
//	String custStoreInput  = "nkl;k"; 
//
//	//String custBuy = "Supermarket has 2% milk";
//	String custBuy = " hey";
//	
//	
//	if(custStoreInput.equalsIgnoreCase("supermarket has full fat milk")){
//	
//		System.out.println("Buy full fat milk");
//	
//	}else {
//		
//		if(custBuy.equalsIgnoreCase("Supermarket has 2% milk")){
//			
//			System.out.println("Buy 2% Milk");
//		}else {
//		   
//			System.out.println("Buy skimmed milk");
//	}
		
//	}	
	
		
	String userInput   = "2 % milk";
	String sale       = "its on sale";
	String expired    = "Expiration date >2 weeks ahead";
	String storecheck1 = "Full fat milk";
	String storecheck2 = "2 % milk";
	
	          
	if(storecheck1.equalsIgnoreCase(userInput)) {
	
	         if(sale.equalsIgnoreCase("its on sale") && expired.equalsIgnoreCase("Expiration date >2 weeks ahead")) {
	        	 System.out.println("Buy 2 gallons full fat milk");
	         }else {
	              System.out.println("Buy 1 gallon full fat milk ");
	         		}
	}
	
	
	else {
	          if(userInput.equalsIgnoreCase(storecheck2 )){
			     
	        	 System.out.println("Buy 2% milk");
	
	         }else {
			      System.out.println("Buy skimmed milk");
	         		}
			}
		
		
	}//end Method

}//end class
