package com.code.sysPedidos_backend.Service;

import java.util.List;
import java.util.Map;

public interface PedidoService {
List<Map<String,Object>> readAll(int idUsuario);
	
	List<Map<String,Object>> readById(int idUsuario, int idPedido);

}
