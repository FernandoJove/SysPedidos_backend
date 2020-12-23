package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Membresia;

public interface MembresiaService {
	
List<Map<String,Object>> readAll();
List<Membresia> readAll2();
	int create (Membresia mem,int id);

}
