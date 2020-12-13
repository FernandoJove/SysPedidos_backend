package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import com.code.sysPedidos_backend.Entity.Detalle_pedido;
import com.code.sysPedidos_backend.Entity.Pedido;


public interface Detalle_pedidoDao {

	int create (Detalle_pedido dp);
	
	List<Map<String,Object>> readAll();
	
	List<Map<String,Object>> selectById(int id);
	
	int SaveDetalle_Pedido(Detalle_pedido det_pedido);
	
	
}
