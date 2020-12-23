package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Usuario;

public interface UserService {
	
	int create (Usuario us);
	int update (Usuario us);
	int delete (int id);
	int cambiarestado (Usuario us);
	List<Usuario> readAll();
	Usuario readid (int id);
	Usuario readdni(String dni);
	
	Usuario read(String nomuser);
	 
	Map<String,Object> datos(String username);
	Usuario validarUsuario(String nomuser);
	
}
