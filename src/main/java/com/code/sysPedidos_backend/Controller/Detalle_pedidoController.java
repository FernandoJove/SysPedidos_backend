package com.code.sysPedidos_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Dao.Detalle_pedidoDao;
import com.code.sysPedidos_backend.Entity.Detalle_pedido;
import com.code.sysPedidos_backend.Entity.Pedido;
import com.code.sysPedidos_backend.Service.Detalle_pedidoService;

@RestController
@RequestMapping("/det_pedido")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Detalle_pedidoController  {
	
	
	@Autowired
	private Detalle_pedidoService detS;

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/{id}")
	public List<Map<String, Object>> selectById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/")
	public int SaveDetalle_Pedido(@RequestBody Detalle_pedido det_pedido) {
		// TODO Auto-generated method stub
		return detS.SaveDetalle_Pedido(det_pedido);
	}
	
	

	
}
