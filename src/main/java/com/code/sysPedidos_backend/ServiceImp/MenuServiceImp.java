package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.MenuDao;
import com.code.sysPedidos_backend.Entity.Menu;
import com.code.sysPedidos_backend.Service.MenuService;
@Service
public class MenuServiceImp implements MenuService{
	
	@Autowired
	private MenuDao md;
	@Override
	public int create(Menu menu, int id) {
		// TODO Auto-generated method stub
		return md.create(menu, id);
	}

	@Override
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return md.update(menu);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return md.delete(id);
		
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return md.readAll();
	}

	@Override
	public List<Map<String, Object>> selectByEmpresa(int id) {
		// TODO Auto-generated method stub
		
		return md.selectByEmpresa(id);
	}

}
