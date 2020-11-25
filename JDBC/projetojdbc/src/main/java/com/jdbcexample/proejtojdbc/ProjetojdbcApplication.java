package com.jdbcexample.proejtojdbc;

import com.jdbcexample.proejtojdbc.entities.Vendedor;
import com.jdbcexample.proejtojdbc.model.dao.DAOFactory;
import com.jdbcexample.proejtojdbc.model.dao.VendedorDAO;

public class ProjetojdbcApplication {

	public static void main(String[] args) {

		VendedorDAO vendedorDAO = DAOFactory.createVendedorDAO();
		Vendedor vendedor = vendedorDAO.findById(1);
		System.out.println(vendedor);
	}

}
