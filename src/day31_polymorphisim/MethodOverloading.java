package day31_polymorphisim;

public class MethodOverloading {

public int add(int a , int b) {
	
	return a+b;
}	
	
public double add(int a , double b) {
	
	return a+b;
}	
	
	
public double add(double a , int b) {
	
	return a+b;
}	
	
	
public double add(double a , double b) {
	
	return a+b;
}		
	
	
public double add(double a ) {
	
	return a+5;
}		
	
public double add() {
	
	return 5+5;
}		
	
public double sup(double a , double b,double c) {
	
	return a+b+c;
}		
	
////////////////////////////////////////////////////////	

public double sup(double x , int y) {
	
	return x-y;
}	
	
	
public double sup(double x , double y) {
	
	return x-y;
}		
	
	
public double sup(double x ) {
	
	return x-9;
}		
	
public double sup() {
	
	return 10-5;
}		
	
public double sup(int x , double y,double z) {
	
	return x-y-z;
}		

	

/////////////////////////////////////////////////////


public int multi(int x , int y) {

return x*y;
}		


public double multi(double x ) {

return x*9;
}		

public double multi() {

return 10*5;
}		

public double multi(int x , double y,double z) {

return x*y*z;
}		
/////////////////////////////////////////////////

public int division(int x , int y) {

return x/y;
}		


public double division(double x ) {

return x/9;
}		

public double division() {

return 10/5;
}		

public double division(int x , double y,double z) {

return x/y/z;
}		



}
