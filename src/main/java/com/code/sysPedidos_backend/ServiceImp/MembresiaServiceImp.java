package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.MembresiaDao;
import com.code.sysPedidos_backend.Entity.Membresia;
import com.code.sysPedidos_backend.Service.MembresiaService;

@Service
public class MembresiaServiceImp implements MembresiaService{
	@Autowired
	private MembresiaDao md;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return md.readAll();
	}

	@Override
	public int create(Membresia mem, int id) {
		// TODO Auto-generated method stub
		return md.create(mem, id);
	}

	@Override
	public List<Membresia> readAll2() {
		// TODO Auto-generated method stub
		return md.readAll2();
	}

}
