package day36_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	
	public static void waitFor3Second() throws InterruptedException {
		
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws FileNotFoundException {
		
	File file = new File("Some location");	
		
		
//		try {
//			FileReader fr = new FileReader(file);
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		
		
	FileReader fr = new FileReader(file);
		
		System.out.println("Im here");
		
		
		
		try {
			waitFor3Second();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("IM here 3 second");
		
		
		
		

	}

}
