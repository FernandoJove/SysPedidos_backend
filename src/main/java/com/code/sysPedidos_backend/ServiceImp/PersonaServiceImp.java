package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.PersonaDao;
import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{
	@Autowired
	private PersonaDao perdao;
	
	@Override
	public int create(Persona per) {
		
		return perdao.create(per);
	}

	@Override
	public int update(Persona per) {
		// TODO Auto-generated method stub
		return perdao.update(per);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return perdao.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return perdao.read(id);
	}

	@Override
	public Persona readdni(String dni) {
		// TODO Auto-generated method stub
		return perdao.readdni(dni);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return perdao.readAll();
	}



}
