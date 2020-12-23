package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.TrabajadorDao;
import com.code.sysPedidos_backend.Entity.Trabajador;
import com.code.sysPedidos_backend.Service.TrabajadorService;

@Service
public class TrabajadorServiceImp implements TrabajadorService{
	@Autowired
	private TrabajadorDao trabDao;
	@Override
	public int create(Trabajador trab) {
		// TODO Auto-generated method stub
		return trabDao.create( trab);
	}

	@Override
	public int update(Trabajador trab) {
		// TODO Auto-generated method stub
		return trabDao.update(trab);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return trabDao.delete(id);
	}

	@Override
	public int cambiarestado(Trabajador trab) {
		// TODO Auto-generated method stub
		return trabDao.cambiarestado(trab);
	}

	@Override
	public List<Map<String, Object>> readAll(int idemp) {
		// TODO Auto-generated method stub
		return trabDao.readAll(idemp);
	}

	@Override
	public Trabajador read(int id) {
		// TODO Auto-generated method stub
		return trabDao.read(id);
	}

	@Override
	public List<Trabajador> readAll2() {
		// TODO Auto-generated method stub
		return trabDao.readAll2();
	}

}
