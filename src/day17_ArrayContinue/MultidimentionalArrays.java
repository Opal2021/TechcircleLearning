package day17_ArrayContinue;

public class MultidimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // index       0 1 2 3 4
	int nums [] = {1,2,3,4,5};
	
	int nums2 [] = {6,7,8,9};
	
	int nums3 [] = {10,11,12,13,14};
	
	//                    0     1     2
	int numbers [] [] = {nums,nums2,nums3};
	
	
	System.out.println(numbers.length);
	
	System.out.println(numbers[0][2]);//3
	
	System.out.println(numbers[2][2]);	
		
	System.out.println(numbers[1][3]);	
		
		
		// search for each Arrays and elements and find odd number.
	
	
	     for (int i = 0 ; i < numbers.length; i++) {
		
//		System.out.println(Arrays.toString(numbers[i]));
		
		for(int j = 0 ; j < numbers[i].length ; j++) {
			
			if (numbers[i][j] % 2 == 0) {
				System.out.println(numbers[i][j]);
			}
		
		
		}
		
	     }
		
		
	}//

}//
