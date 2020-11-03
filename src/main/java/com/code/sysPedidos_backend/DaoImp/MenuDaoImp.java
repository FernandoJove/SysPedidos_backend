package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.MenuDao;
import com.code.sysPedidos_backend.Entity.Menu;

@Repository
public class MenuDaoImp implements MenuDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	@Override
	public int create(Menu menu, int id) {
		String SQL ="insert into Menu(Plato,Precio,Estado,idEmpresa) values(?,?,?,?)";
		return jdbc.update(SQL, menu.getPlato(),menu.getPrecio(),menu.getEstado(),id);
	}

	@Override
	public int update(Menu menu) {
		String SQL= "update Menu set Plato = ?,Precio = ?,Estado = ? where idMenu = ? ";
		return jdbc.update(SQL,menu.getPlato(),menu.getPrecio(),menu.getEstado(),menu.getIdMenu());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
