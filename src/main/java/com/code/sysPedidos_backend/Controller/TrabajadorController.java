package com.code.sysPedidos_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService ts;

	@PostMapping("/{idEmp}/{idUsu}/{idRol}")
	public int create(@PathVariable int idEmp, int idUsu, int idRol) {
		// TODO Auto-generated method stub
		return ts.create(idEmp, idUsu, idRol);
	}

	@PutMapping("/{idEmp}/{idUsu}/{id}")
	public int update(@PathVariable int idEmp, @PathVariable int idUsu,@PathVariable int idRol, @PathVariable int id) {
		// TODO Auto-generated method stub
		return ts.update(idEmp, idUsu, idRol, id);
	}

	@PutMapping("/{id}")
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ts.delete(id);
	}

	@GetMapping("/{idEmp}")
	public List<Map<String, Object>> readAll(@PathVariable int idEmp) {
		// TODO Auto-generated method stub
		return ts.readAll(idEmp);
	}

	@GetMapping("/All/{id}")
	public List<Map<String, Object>> readById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return ts.readById(id);
	}
	

}
