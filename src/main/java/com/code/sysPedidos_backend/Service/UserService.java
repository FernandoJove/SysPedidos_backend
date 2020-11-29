package com.code.sysPedidos_backend.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.User;

public interface UserService {
	
	int create (User us,int id);
	int update (User us);
	int delete (int id);
	
}
