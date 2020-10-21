package com.jdbcexample.proejtojdbc;

import java.util.Date;

import com.jdbcexample.proejtojdbc.entities.Departamento;
import com.jdbcexample.proejtojdbc.entities.Vendedor;

public class ProjetojdbcApplication {

	public static void main(String[] args) {

		Departamento d1 = new Departamento(1, "Games");
		System.out.println(d1);
		
		Vendedor v1 = new Vendedor(1, "Bob", "bob@gmail.com", new Date(), 2300, d1);
		System.out.println(v1);
	}

}
