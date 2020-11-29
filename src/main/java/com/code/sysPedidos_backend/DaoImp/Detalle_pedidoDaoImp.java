package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.Detalle_pedidoDao;
import com.code.sysPedidos_backend.Entity.Detalle_pedido;

@Repository
public class Detalle_pedidoDaoImp implements Detalle_pedidoDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int create(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		String SQL ="insert into detalle_pedido ";
		return jdbc.update(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		
		String SQL ="";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> selectById(int id) {
		// TODO Auto-generated method stub
		String SQL ="select ";
		return jdbc.queryForList(SQL);
	}

}
