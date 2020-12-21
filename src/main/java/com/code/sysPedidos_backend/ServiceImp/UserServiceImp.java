package com.code.sysPedidos_backend.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Usuario;
import com.code.sysPedidos_backend.Service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDao userDao; 
	@Override
	public int create(Usuario us, int id) {
		// TODO Auto-generated method stub
		return userDao.create(us, id);
	}

	@Override
	public int update(Usuario us) {
		// TODO Auto-generated method stub
		return userDao.update(us);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

}
