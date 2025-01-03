package performingBasicJdbcOperations;
import java.sql.*;

public class JdbcInsertDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "student";
		String pass = "student";

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);

			// 2. Create a statement
			myStmt = myConn.createStatement();

			// 3. Insert a new employee
			System.out.println("Inserting a new employee to database\n");

			int rowsAffected = myStmt
					.executeUpdate("insert into employees " + "(last_name, first_name, email, department, salary) "
							+ "values " + "('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");

			System.out.println("The number of rows affected by the insert query are: " + rowsAffected);
			// since i ran this query twice from eclipse Eric gets into the db twice

			// 4. Verify this by getting a list of employees
			myRs = myStmt.executeQuery("select * from employees order by last_name");

			// 5. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
