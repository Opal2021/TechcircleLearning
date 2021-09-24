package day29_Inheritance;

public class Teacher {

	//supper class
	
	private String designation = "Techer";
	private String collegeName = "Techcircle";
	
	public void does() {
		
		System.out.println("Teaching");
	}


   public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
