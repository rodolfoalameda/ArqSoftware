package com.jdbcexample.proejtojdbc.model.dao;

import java.util.List;

import com.jdbcexample.proejtojdbc.entities.Departamento;

public interface DepartamentoDAO {

	void insert(Departamento dep);
	void update(Departamento dep);
	void deleteById(Integer id);
	Departamento findById(Integer id);
	List<Departamento> findAll();
	
	
}
