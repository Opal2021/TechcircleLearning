package day37_CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

import day31_polymorphisimPerson.Developer;
import day31_polymorphisimPerson.Employee;
import day31_polymorphisimPerson.Tester;

public class Test_PriorityQueueInQueue {

	public static void main(String[] args) {
		
		
		Queue <String> queue =new PriorityQueue<>();
		
	    queue.add("Apple");
		
		System.out.println(queue.element());	
		
		queue.offer("Pear");// same as add element
		
		System.out.println(queue.peek());
		
		queue.remove(); // remove from the head of the queue
		
		System.out.println(queue.peek()); // head of the queue
		
		queue.offer("Mango");
		
		queue.offer("Banana");
		
		//System.out.println(queue.element());	
		
		queue.poll(); //remove
		
		System.out.println(queue.peek());
		
		
	Queue <Employee>	workers = new PriorityQueue<>();
	
	Tester dina = new Tester ("Dina",20,'F',75,"10001")	;
	
	Tester nadia = new Tester ("Nadia",20,'F',65,"10002");	
		
	Tester pedro = new Tester ("Pedro",20,'M',85,"10003");		
		
	Tester elira = new Tester ("Elira",20,'F',85,"10004");		
		
	Tester darima = new Tester ("Darima",20,'F',85,"10005");	
		
		
	Developer famira = new Developer("Famira",20,'F',65,"10006");
	Developer hannah = new Developer("Hannah",20,'F',65,"10007");
	
		
	workers.offer(elira);
	workers.add(pedro);
		
	System.out.println(workers.isEmpty());	
	
	workers.poll().eat();//Java doesn't like it
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end method

}//end class
