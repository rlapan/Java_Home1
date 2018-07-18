package HW4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/romannew_schema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&usessl=false";

	// Database credentials
	static final String USER = "Roman";
	static final String PASS = "1234";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM romannew_schema.users_table";
			ResultSet rs = stmt.executeQuery(sql);
			
			// STEP 4.1
						List<Student> studentsList = new ArrayList<>();
			// STEP 5: Extract data from result set
						while (rs.next()) {
							// Retrieve by column name
							studentsList.add(new Student(rs.getInt("idUsers_table"), rs
									.getString("users_tablecol"), rs.getInt("users_age")));
						}
							// STEP 5.1
							for (Student student : studentsList) {
								System.out.println(student);
							}

							// STEP 6: Clean-up environment
							rs.close();
							stmt.close();
							conn.close();
						} catch (SQLException se) {
							// Handle errors for JDBC
							se.printStackTrace();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							// finally block used to close resources
							try {
								if (stmt != null)
									stmt.close();
							} catch (SQLException se2) {
							
							}// nothing we can do
							try {
								if (conn != null)
									conn.close();
							} catch (SQLException se) {
								se.printStackTrace();
							}// end finally try
						}// end try
						System.out.println("Goodbye!");
					}// end main
				}// end FirstExample