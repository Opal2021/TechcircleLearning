package day31_polymorphisimPerson;

import java.util.ArrayList;

public class AppleInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Tester dina = new Tester ("Dina",20,'F',75,"10001")	;
		
	Tester nadia = new Tester ("Nadia",20,'F',65,"10002");	
		
	Tester pedro = new Tester ("Pedro",20,'M',85,"10003");		
		
	Tester elira = new Tester ("Elira",20,'F',85,"10004");		
		
	Tester darima = new Tester ("Darima",20,'F',85,"10005");	
		
		
	Developer famira = new Developer("Famira",20,'F',65,"10006");
	Developer hannah = new Developer("Hannah",20,'F',65,"10007");
	
		
	ArrayList<Tester> testers = new ArrayList<>	();
	
	testers.add(elira);
	testers.add(pedro);
	testers.add(darima);	
	testers.add(nadia);	
	testers.add(dina);
	
	for(Tester sdet : testers) {
		
		sdet.executeTestCase();
		sdet.executeRegressTest();
		sdet.executeSmokeTest();
		//sdet.toString();
		System.out.println(sdet.toString());
		System.out.println(sdet.calculateSalary());
		//sdet.calculateSalary();
		sdet.work();
		sdet.eat();
		sdet.sleep();
		
		System.out.println("============================");
		
	}
	
	ArrayList<Developer> devs = new ArrayList <>();
	
	devs.add(hannah);
	devs.add(famira);
	
	for(Developer dev : devs) {
		
		dev.buildAndDeployApplication();
		dev.developpingNewFunctionality();
		dev.debugging();
		dev.eat();
		
		System.out.println(dev.toString());
		System.out.println(dev.calculateSalary());
		
		dev.sleep();
		dev.work();
	}
	
	
	ArrayList <Employee> list = new ArrayList <>();
	
	list.addAll(devs);
	list.addAll(testers);
	
	//list.get(0).work();
	
	//Overriding
	
	Employee  e = new Tester("Darima",20,'F',85,"10005");
	
	e.work();
	
	Employee  d = new Tester("Elira",20,'F',85,"10004");
	
	d.work();
	
	
	for(int i = 0 ;i <list.size();i++) {
		
		list.get(i).work();
		
		//list.get(i).calculateSalary();
		// pull it in println
		
		System.out.println(list.get(i).calculateSalary());
		
		System.out.println(list.get(i).toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
