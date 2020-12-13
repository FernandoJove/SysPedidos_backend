package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.PedidoDao;
import com.code.sysPedidos_backend.Entity.Pedido;
import com.code.sysPedidos_backend.Service.PedidoService;

@Service
public class PedidoServiceImp implements PedidoService{
	
	@Autowired
	private PedidoDao pd;

	@Override
	public List<Map<String, Object>> readAll(int idUsuario) {
		// TODO Auto-generated method stub
		return pd.readAll(idUsuario);
	}

	@Override
	public List<Map<String, Object>> readById(int idUsuario, int idPedido) {
		// TODO Auto-generated method stub
		return pd.readById(idUsuario, idPedido);
	}

	@Override
	public int SavePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return pd.SavePedido(pedido);
	}

	/*@Override
	public void SavePedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return pd.SavePedido(pedido);
	}*/

}
