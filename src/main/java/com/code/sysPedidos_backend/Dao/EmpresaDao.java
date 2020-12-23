package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Empresa;



public interface EmpresaDao {
	int create (Empresa emp);
	int update (Empresa emp);
	int delete (int id);
	Empresa read (int id);
	List<Map<String,Object>> readAll();

}
