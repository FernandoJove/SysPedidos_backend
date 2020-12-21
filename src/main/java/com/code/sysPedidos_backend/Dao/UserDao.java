package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Entity.Usuario;

public interface UserDao {
	int create (Usuario us,int id);
	int update (Usuario us);
	int delete (int id);
	Usuario read(String nomuser);
	 
	Map<String,Object> datos(String username);
	Usuario validarUsuario(String nomuser);
	
	
}
