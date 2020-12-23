package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Trabajador;

public interface TrabajadorService {

	int create (Trabajador trab);
	int update (Trabajador trab);
	int delete (int id);
	int cambiarestado (Trabajador trab);
	List<Map<String,Object>> readAll(int idemp);
	List <Trabajador> readAll2();
	Trabajador read(int id);
}
