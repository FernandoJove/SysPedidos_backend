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

import com.code.sysPedidos_backend.Entity.Menu;
import com.code.sysPedidos_backend.Entity.Pedido;
import com.code.sysPedidos_backend.Service.PedidoService;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PedidoController {
	
	@Autowired
	private PedidoService ps;

	@GetMapping("/{idUsuario}")
	public List<Map<String, Object>> readAll(int idUsuario) {
		// TODO Auto-generated method stub
		return ps.readAll(idUsuario);
	}

	@GetMapping("/{idUsuario}/{idPedido}")
	public List<Map<String, Object>> readById(int idUsuario, int idPedido) {
		// TODO Auto-generated method stub
		return ps.readById(idUsuario, idPedido);
	}
	
	@PostMapping("/")
	public int createPedido(@RequestBody Pedido pedido) {
		System.out.println(pedido.getFecha_pedido());
		// TODO Auto-generated method stub
		return ps.SavePedido(pedido);
	}
	
	

}
