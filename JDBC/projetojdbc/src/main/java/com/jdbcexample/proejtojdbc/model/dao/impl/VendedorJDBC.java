package com.jdbcexample.proejtojdbc.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.jdbcexample.proejtojdbc.entities.Vendedor;
import com.jdbcexample.proejtojdbc.model.dao.VendedorDAO;

import db.DB;
import db.DBException;

public class VendedorJDBC implements VendedorDAO {

	private Connection conn;

	public VendedorJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Vendedor dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Vendedor dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vendedor findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(
					"select v.id, v.nome, v.email, v.datanasc, v.salario " + " from vendedor v " + " where v.id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {

				Vendedor vend = new Vendedor();
				vend.setId(rs.getInt("id"));
				vend.setNome(rs.getString("nome"));
				vend.setEmail(rs.getString("email"));
				vend.setDataNasc(rs.getDate("dataNasc"));
				vend.setSalario(rs.getDouble("salario"));

				return vend;
			}
			return null;

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}

	}

	@Override
	public List<Vendedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}


