package com.jdbcexample.proejtojdbc.model.dao;

import com.jdbcexample.proejtojdbc.model.dao.impl.VendedorJDBC;

import db.DB;

public class DAOFactory {

	public static VendedorDAO createVendedorDAO() {
		return new VendedorJDBC(DB.getConnection());
	}
	
}
