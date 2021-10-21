package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Intro_Jdbc {

	public static void main(String[] args) throws SQLException {
		
		String constr = "jdbc:oracle:thin:@23.22.179.40:1521:XE";
		String user   = "hr";
		String password = "hr";
		
	Connection con = DriverManager.getConnection(constr,user,password);
		
	Statement stmt = con.createStatement();	
		
		
	String s = "select employee_id,first_name,last_name from employees"	;
	
	ResultSet rs =  stmt.executeQuery(s);
	
	while(rs.next()) {
		
		int eid = rs.getInt("employee_id");
		
		String fname = rs.getString("first_name");
		
		String lname = rs.getString("last_name");
		
		
		
	}
	
	stmt.close();
	rs.close();
	con.close();
	
	}//end method

}//end class
