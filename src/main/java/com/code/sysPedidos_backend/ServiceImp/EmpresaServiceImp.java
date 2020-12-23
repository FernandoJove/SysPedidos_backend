package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.EmpresaDao;
import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Service.EmpresaService;
@Service
public class EmpresaServiceImp implements EmpresaService{

	@Autowired
	private EmpresaDao ed;
	
	@Override
	public int create(Empresa emp) {
		// TODO Auto-generated method stub
		return ed.create(emp);
	}

	@Override
	public int update(Empresa emp) {
		// TODO Auto-generated method stub
		return ed.update(emp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ed.delete(id);
	}

	@Override
	public Empresa read(int id) {
		// TODO Auto-generated method stub
		return ed.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ed.readAll();
	}

}
