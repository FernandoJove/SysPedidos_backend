package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

public interface TrabajadorDao {
	
	int create (int idEmp, int idUsu,int idRol);
	int update (int idEmp, int idUsu,int idRol, int id);
	int delete (int id);
		
	List<Map<String,Object>> readAll(int idEmp);
	
	List<Map<String,Object>> readById(int id);


}
