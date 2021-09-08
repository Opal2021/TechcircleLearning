package day16_arrays;

import java.util.Arrays;

public class ReviewArrayWithPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Array

		int num [] = {11,22,33,44,} ;
		String str [] = {"black","white","green","yellow",} ;

		// System.out.println(Arrays.toString(str));
		// for each
		for (int arrayNum: num) {
		if (arrayNum % 2 == 0) {
		// System.out.println(arrayNum);
		}
		}
		// *****for loop i *************
		int lengthStr = str.length;
		boolean chk = false;
		for (int i = 0 ; i < lengthStr; i++) {
		//System.out.println(str[i]);
		if (str[i].equalsIgnoreCase("test")) {
		System.out.println("found");
		chk = true;

		}else
		break;
		}

		if (chk == false){
		System.out.println("NOT FOUND!!");
		}

		// Add Array size

		String strSize [] = new String[3];
		strSize[0] = "Por" ;
		strSize[1] = "Park" ;
		strSize[2] = "PorPark" ;
		
		System.out.println(Arrays.toString(strSize));
		
	}//

}//
