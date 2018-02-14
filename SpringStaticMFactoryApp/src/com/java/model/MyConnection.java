package com.java.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static Connection connection;

	static {
		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private MyConnection() {

		throw new IllegalAccessError();
	}

	public static Connection getInstance(String name) throws SQLException,
			ClassNotFoundException {

		return connection;
	}

}
