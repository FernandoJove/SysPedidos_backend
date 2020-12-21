package com.code.sysPedidos_backend.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Usuario;

public interface UserService {
	
	int create (Usuario us,int id);
	int update (Usuario us);
	int delete (int id);
	
}
