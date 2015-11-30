package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import interfaces.PersistenceConnection;

public class PersistenceConnectionHsqlImpl implements PersistenceConnection {

	protected Connection conn;

	@Override
	public void connect() {
		try {
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydatabase", "SA", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void commit() {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rollback() {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void setSavepoint(String name) {
		try {
			conn.setSavepoint(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
