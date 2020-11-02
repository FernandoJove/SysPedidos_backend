package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao {
	
	List<Map<String,Object>> readAll();
	
}
