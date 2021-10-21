package polymorphism_CompileTime_RunTime;

public class MothodOveriding {

//////Method overriding//////////

	public class AnimalMOR {


    public void sound (){
    
    System.out.println("Animal class sounds ");
 
    }


    public void eat (){

    System.out.println("Animal class eats ");

    }


    public void movement (){

    	System.out.println("Animal class moves ");

    }
////////////////////////////////////////////////////////////
    
    public class DogMOR extends AnimalMOR {

    	public void sound (){
    	System.out.println("Dog class sounds Bok-Bok ");
    	}

    	public void eat (){
    	System.out.println("Dog class eats bone ");
    	}

    	public void movement (){
    	System.out.println("Dog class runs ");
    	}
    	}
    	
    
    /////////////////////////////////////////////////////
    	public class HorseMOR extends AnimalMOR {

    	public void sound (){
    	System.out.println("Horse class sounds Hee-Yha ");
    	}

    	public void eat (){
    	System.out.println("Horse class eats grass ");
    	}

    	public void movement (){
    	System.out.println("Horse class gallops ");
    	}
    	}
    	
    	
  //////////////////Main method!!!!/////////////////////////////////
    	
    // Method overriding : allows a user to override a method in the super class
    // by a child class.
    	
    // We must use an inheritance using keyword extends child class with parents.

    	AnimalMOR a1 = new AnimalMOR();

    	// a1.eat();
    	// a1.movement();
    	// a1.sound();

    	// AnimalMOR a2 = new DogMOR();
    	// a2.eat();
    	// a2.movement();
    	// a2.sound();

    	AnimalMOR a3 = new HorseMOR();
//    	
//    	a3.eat();
//    	a3.movement();
//    	a3.sound();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
	
	
	
	
	
	
}
