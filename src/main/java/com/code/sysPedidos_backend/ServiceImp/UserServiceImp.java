package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

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
	public int update(Usuario us) {
		// TODO Auto-generated method stub
		return userDao.update(us);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	@Override
	public int create(Usuario us) {
		// TODO Auto-generated method stub
		return userDao.create(us);
	}

	@Override
	public int cambiarestado(Usuario us) {
		// TODO Auto-generated method stub
		return userDao.cambiarestado(us);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return userDao.readAll();
	}

	@Override
	public Usuario readid(int id) {
		// TODO Auto-generated method stub
		return userDao.readid(id);
	}

	@Override
	public Usuario readdni(String dni) {
		// TODO Auto-generated method stub
		return userDao.readdni(dni);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return userDao.read(nomuser);
	}

	@Override
	public Map<String, Object> datos(String username) {
		// TODO Auto-generated method stub
		return userDao.datos(username);
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		// TODO Auto-generated method stub
		return userDao.validarUsuario(nomuser);
	}

}
