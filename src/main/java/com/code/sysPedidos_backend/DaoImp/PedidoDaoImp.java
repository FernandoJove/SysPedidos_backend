package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.PedidoDao;

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

}
