package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.RolDao;
import com.code.sysPedidos_backend.Entity.Rol;
import com.code.sysPedidos_backend.Service.RolService;

@Service
public class RolServiceImp implements RolService{

	@Autowired
	private RolDao rd;
	
	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		return rd.create(rol);
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		return rd.update(rol);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rd.delete(id);
	}

	

	@Override
	public List<Map<String, Object>> readById(int id) {
		// TODO Auto-generated method stub
		return rd.readById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rd.readAll();
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return rd.read(id);
	}

	@Override
	public int cambiarestado(Rol rol) {
		// TODO Auto-generated method stub
		return rd.cambiarestado(rol);
	}

	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		// TODO Auto-generated method stub
		return rd.buscarRolUser(iduser);
	}

	
}
