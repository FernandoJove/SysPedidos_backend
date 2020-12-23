package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Membresia;
import com.code.sysPedidos_backend.Entity.Persona;

@Repository
public interface MembresiaDao {

	List<Map<String,Object>> readAll();
	List<Membresia> readAll2();
	int create (Membresia mem,int id);


}
