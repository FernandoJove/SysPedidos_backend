package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Pedido;

public interface PedidoDao {
	
	List<Map<String,Object>> readAll(int idUsuario);
	
	List<Map<String,Object>> readById(int idUsuario, int idPedido);

	int SavePedido(Pedido pedido);
	
	
	
}
