package com.code.sysPedidos_backend.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.Detalle_pedidoDao;
import com.code.sysPedidos_backend.Entity.Detalle_pedido;
import com.code.sysPedidos_backend.Service.Detalle_pedidoService;

@Service
public class Detalle_pedidoServiceImp implements Detalle_pedidoService{
	@Autowired
	private Detalle_pedidoDao pdao;
	
	@Override
	public int SaveDetalle_Pedido(Detalle_pedido det_pedido) {
		// TODO Auto-generated method stub
		return pdao.SaveDetalle_Pedido(det_pedido);
	}

	
}
