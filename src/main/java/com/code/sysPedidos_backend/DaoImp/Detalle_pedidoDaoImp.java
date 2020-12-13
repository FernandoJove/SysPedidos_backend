package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.Detalle_pedidoDao;
import com.code.sysPedidos_backend.Entity.Detalle_pedido;
import com.code.sysPedidos_backend.Entity.Pedido;

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

	@Override
	public int SaveDetalle_Pedido(Detalle_pedido det_pedido) {
		// TODO Auto-generated method stub
		String SQL="insert into detalle_pedido(cantidad,costoprod,idPedidos,idMenu) values  (?,?,?,?);";
	     jdbc.update(SQL,det_pedido.getCantidad(),det_pedido.getCostoprod(),det_pedido.getIdPedidos(),det_pedido.getIdMenu());
		 String sql = "SELECT LAST_INSERT_ID()";

		    int count = jdbc.queryForObject(
		                        sql, new Object[] { }, Integer.class);
		           
		    
		    System.out.println("Hola soy el count " +count);
			return count;
		
	}

}
