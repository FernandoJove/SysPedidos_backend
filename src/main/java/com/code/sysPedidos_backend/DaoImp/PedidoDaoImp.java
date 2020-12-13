package com.code.sysPedidos_backend.DaoImp;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.PedidoDao;
import com.code.sysPedidos_backend.Entity.Pedido;

@Repository
public class PedidoDaoImp implements PedidoDao{

	@Autowired
	private JdbcTemplate jdbc;

	
	@Override
	public List<Map<String, Object>> readAll(int idUsuario) {
		// TODO Auto-generated method stub
		String SQL="select * from pedidos where idUsuario = ?";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readById(int idPedido, int idUsuario) {
		// TODO Auto-generated method stub
		String SQL ="select * from pedidos where idUsuario = ? and idPedidos= ?";
		return jdbc.queryForList(SQL, idPedido, idUsuario);
	}

	@Override
	public int SavePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println(pedido.getFecha_pedido());
		String SQL="insert into pedidos( fecha_pedido,direntrega,estado,metodocompra,costototal,idUsuario,idEmpresa) values  (?, ?, ?, ? , ?,?,?);";
	     jdbc.update(SQL,pedido.getFecha_pedido(), pedido.getDirentrega(), pedido.getEstado(),pedido.getMetodocompra(), pedido.getCostototal(),pedido.getIdUsuario(),pedido.getIdEmpresa());
		 String sql = "SELECT LAST_INSERT_ID()";

		    int count = jdbc.queryForObject(
		                        sql, new Object[] { }, Integer.class);
		           
		    
		    System.out.println("Hola soy el count " +count);
			return count;

		   
	}

}
