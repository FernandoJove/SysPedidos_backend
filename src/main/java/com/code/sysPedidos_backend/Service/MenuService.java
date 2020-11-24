package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Menu;

public interface MenuService {
	
	int create (Menu menu,int id);
	int update (Menu menu);
	int delete (int id);

	List<Map<String,Object>> readAll();
	
	List<Map<String,Object>> selectByEmpresa(int id);
}
