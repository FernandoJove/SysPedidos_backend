package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Entity.User;

public interface UserDao {
	int create (User us,int id);
	int update (User us);
	int delete (int id);
	
}
