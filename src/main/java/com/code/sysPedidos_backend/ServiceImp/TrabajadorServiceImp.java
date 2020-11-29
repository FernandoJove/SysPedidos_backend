package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.TrabajadorDao;
import com.code.sysPedidos_backend.Service.TrabajadorService;

@Service
public class TrabajadorServiceImp implements TrabajadorService{
	@Autowired
	private TrabajadorDao tr;

	@Override
	public int create(int idEmp, int idUsu, int idRol) {
		// TODO Auto-generated method stub
		return tr.create(idEmp, idUsu, idRol);
	}

	@Override
	public int update(int idEmp, int idUsu, int idRol, int id) {
		// TODO Auto-generated method stub
		return tr.update(idEmp, idUsu, idRol, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tr.delete(id);
	}

	@Override
	public List<Map<String, Object>> readAll(int idEmp) {
		// TODO Auto-generated method stub
		return tr.readAll(idEmp);
	}

	@Override
	public List<Map<String, Object>> readById(int id) {
		// TODO Auto-generated method stub
		return tr.readById(id);
	}

}
