package com.jdbcexample.proejtojdbc;

import java.sql.Connection;

import db.DB;

public class ProejtojdbcApplication {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		DB.closeConnection();

	}

}
