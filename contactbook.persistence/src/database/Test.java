package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import interfaces.PersistenceConnection;

public class Test extends PersistenceConnectionHsqlImpl {

	public void getPersons() {

		connect();
		PreparedStatement stmt;
		ResultSet rs;
		 try {
			stmt = conn.prepareStatement("SELECT * FROM gruppe42");
			rs = stmt.executeQuery();
			while(rs.next()) {
				 System.out.println(rs.getString("person"));
				 
			 }
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 disconnect();
	}

}
