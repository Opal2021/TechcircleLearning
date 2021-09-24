package day29_Inheritance;

public class BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Book book1 = new Book()	;
	
	    book1.title  = "Java SE8 programming";
	    book1.author = "Kathrine";
	    book1.type   = "Programming";
	    book1.price  = 35.8;
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.type);
		System.out.println(book1.price);
		
		
		AudioBook book2 = new AudioBook();
		
		book2.title  = "Java SE8 programming";
		book2.author = "Kathrine";
		book2.type   = "Programming";
		book2.price  = 35.8;
		book2.length = 4;
		book2.narrator = "John";
		
		book2.listen();
		
		
		Ebook book3 = new Ebook();
		
		    book3.title  = "Java SE8 programming";
		    book3.author = "Kathrine";
		    book3.type   = "Programming";
		    book3.price  = 35.8;
		    book3.size   = 2;
		    book3.page   = 500;
		
		book3.readBook();
		
		
	}

}
