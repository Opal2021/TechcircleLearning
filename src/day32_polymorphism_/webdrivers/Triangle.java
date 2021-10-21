package day32_polymorphism_.webdrivers;

public class Triangle extends Shape {

   double hight , base;
   
   public Triangle () {
	   
	   super("Triangle");
   }
   
   
  

public Triangle(double hight, double base) {
	super();
	this.hight = hight;
	this.base = base;
}




@Override
public double getArea() {
	
	return hight * base * base /2;
}
}