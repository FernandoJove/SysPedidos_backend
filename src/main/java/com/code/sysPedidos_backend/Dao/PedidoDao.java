package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

public interface PedidoDao {
	
	List<Map<String,Object>> readAll(int idUsuario);
	
	List<Map<String,Object>> readById(int idUsuario, int idPedido);

}
