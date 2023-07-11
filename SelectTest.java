import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Department;

public class SelectTest {

	public static void main(String[] args) {
	
		try {
			System.out.println("Loading driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver()); //jar file : hsqldb.jar
			System.out.println("Driver loaded...");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected to the db : "+conn);
			
				Statement statement = conn.createStatement();
				System.out.println("Statement created...");
				
				ResultSet result = statement.executeQuery("SELECT * FROM DEPT");
				System.out.println("Query fired, got the result....");
				
				while(result.next()) {
					Department dept = new Department(); // a blank object
						dept.setDepartmentNumber(result.getInt(1));
						dept.setDepartmentName(result.getString(2));
						dept.setDepartmentLocation(result.getString(3));
					
					System.out.println("DEPTNO    : "+dept.getDepartmentNumber());
					System.out.println("DEPT NAME : "+dept.getDepartmentName());
					System.out.println("LOCATION  : "+dept.getDepartmentLocation());
					System.out.println("---------------------------");
				}
				
			conn.close();
			System.out.println("Disconnected from the DB..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
