package polymorphism_CompileTime_RunTimeOverloading;

public class FindArea {

	public void FindAreaPoly () {
		
		int a = 2;
		int b = 3;
		int sum = a*b;
		
		System.out.println(sum);
	}
	
	public void FindAreaPoly (int a, int b) {
		
		System.out.println(a*b);
		
		
	}
	
	
	public void FindAreaPoly (double a, double b) {
		
		System.out.println(a*b);
		
		
	}
	

	public void FindAreaPoly (String a) {
		
		String horseType = a;
				
		System.out.println("This farm has "+ horseType );
		
	
	}
	
	
	
	
	
	
}
