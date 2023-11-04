package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Datatomysql {
	public static void main(String[] args) {
		try {
			  // Jdbc sql server Driver
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dataconnect";
			String username="root";
			String password="salman@123";
			//it is used for connection
			Connection conn=DriverManager.getConnection(url,username,password);
			System.out.println("connected");
			Statement smt= conn.createStatement();
			String query="Insert into fruits values(4,'banankal',510)";
			smt.execute(query);
			System.out.println("Inserted");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		}
		

}
