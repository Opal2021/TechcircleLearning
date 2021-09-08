package day16_arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] months;
		
		//String names[] ={"Erkin","Elira","Darima","Dina","Pedro","Famira"};
		
		
		//index                  0 1 2 3 4 5 6 7 
		int nums [] = new int[] {1,3,4,5,6,7,8,9};
		
		System.out.println(nums[0]);//1
		
		System.out.println(nums[3]);//5
		
		System.out.println(nums[6]);//8
		
		//index                           0      1        2        3      4        5
		String names[] = new String[] {"Erkin","Elira","Darima","Dina","Pedro","Famira"};
		
		System.out.println(names[1]);//Elira
		
		System.out.println(names[5]);
		
		
		
		//Created Arrays
		
		String fruits[] = new String[6];
		
		System.out.println(fruits[0]);//null
		System.out.println(fruits[1]);//null
		System.out.println(fruits[2]);//null
		System.out.println(fruits[3]);//null
		System.out.println(fruits[4]);//null
		System.out.println(fruits[5]);//null
		
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Orange";
		fruits[3] = "Kivi";
		fruits[4] = "Mango";
		fruits[5] = "Pear";
		fruits[6] = "Apple";
		
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);		
		
		//Re assign and dont forget to print
		
		fruits[3] = "Kiwis";
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);		
		
		
	//	fruits[6] = "Malon";
		
		
	//	System.out.println(fruits[6]);		
		
		
		}//

}//
