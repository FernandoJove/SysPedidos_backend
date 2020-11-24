package com.code.sysPedidos_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Service.EmpresaService;

@RestController
@RequestMapping("/empresa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmpresaController  {

	@Autowired
	private EmpresaService es;
	
	@PostMapping("/")
	public int create(@RequestBody Empresa emp) {
		// TODO Auto-generated method stub
		
		return es.create(emp);
	}

	@PutMapping("/")
	public int update(@RequestBody Empresa emp) {
		// TODO Auto-generated method stub
		return es.update(emp);
	}

	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return es.delete(id);
	}

	@GetMapping("/{id}")
	public Empresa read(@PathVariable int id) {
		// TODO Auto-generated method stub
		return es.read(id);
	}

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return es.readAll();
	}

}
