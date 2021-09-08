package day17_ArrayContinue;

public class ArraysCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,8,3};
		
		int b[] = new int[a.length];
		
		b = a;
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(a[0] == b[0]);
		
		
		// You can do this but  the location will be different.
		
		b[0] = a[0];
		b[1] = a[1];
		b[2] = a[2];
		
		System.out.println(a[0] == b[0]);
        
		System.out.println(a);
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
