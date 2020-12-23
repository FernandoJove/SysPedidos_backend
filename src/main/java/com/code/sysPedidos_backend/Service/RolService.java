package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import com.code.sysPedidos_backend.Entity.Rol;

public interface RolService {

	int create (Rol rol);
	int update (Rol	 rol);
	int delete (int id);	
	List<Rol> readAll();
	Rol read (int id);
	int cambiarestado (Rol rol);
	
	List<Map<String,Object>> readById(int id);
	List<GrantedAuthority> buscarRolUser(int iduser);
}
