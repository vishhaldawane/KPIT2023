import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
					System.out.println("DEPTNO    : "+result.getInt(1));
					System.out.println("DEPT NAME : "+result.getString(2));
					System.out.println("LOCATION  : "+result.getString(3));
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
