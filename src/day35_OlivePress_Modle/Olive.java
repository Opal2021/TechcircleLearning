package day35_OlivePress_Modle;

public abstract class Olive {


	private String name ;
	private String color;
	private int  unit;
	
	public  abstract String getOrigine ();
	
	
	public Olive () {}
	
	public Olive(String name, String color, int unit) {
		super();
		this.name = name;
		this.color = color;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int crush() {
		
		String message = name + " olive is from "+ getOrigine() + "unit of oli when it crush"+ unit;
		System.out.println(message);
		System.out.println("Ouch!!!");
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
