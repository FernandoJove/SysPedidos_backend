package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import com.code.sysPedidos_backend.Entity.Rol;


public interface RolDao {
	
	int create (Rol rol);
	int update (Rol	 rol);
	int delete (int id);
		
	List<Map<String,Object>> readAll();
	
	List<Map<String,Object>> readById(int id);
	List<GrantedAuthority> buscarRolUser(int iduser);

}
