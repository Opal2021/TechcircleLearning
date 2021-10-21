package day33_Abstract.Cars;

public class CarShop {

	public static void main(String[] args) {
		

	Mercedes m1 = new Mercedes("G450","white",45000,2021);
	
	Tesla t1 = new Tesla("Model S","Red",90000,2021);
		
		
	Car b1 = new BMW("X5","Black",60000,2020);	
		
		
	Car camry = new Toyota("Camry","Silver",25000,2020);	
		
		
		Car cars [] = {m1,t1,b1,camry};
		
		for(int i = 0 ; i < cars.length;i ++) {
			
			cars[i].start();
			System.out.println(cars[i].toString());
		}
		
		
		
		
		
		
	}

}
