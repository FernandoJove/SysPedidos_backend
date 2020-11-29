package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Rol;

public interface RolService {

	int create (Rol rol);
	int update (Rol	 rol);
	int delete (int id);
		
	List<Map<String,Object>> readAll();
	
	List<Map<String,Object>> readById(int id);
}
