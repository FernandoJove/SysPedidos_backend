package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Persona;

@Repository
public interface PersonaDao {
	
	int create (Persona per);
	int update (Persona	 per);
	int delete (int id);
	Empresa read (int id);
	List<Map<String,Object>> readAll();
	
}
