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
		String SQL ="delete from menu where idmenu = ? ";
		return jdbc.update(SQL, id);
	}


	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select * from menu";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> selectByEmpresa(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		String SQL="select m.idMenu,m.plato,m.precio,m.descripcion,m.url from menu as m,empresa as e where e.idempresa and m.idmenu = e.idempresa and m.idempresa= ?";
		return jdbc.queryForList(SQL,id);
	}

}
