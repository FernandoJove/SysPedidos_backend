package com.code.sysPedidos_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Rol;
import com.code.sysPedidos_backend.Service.RolService;

@RestController
@RequestMapping("/rol")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RolController  {
	
	@Autowired
	private RolService rs;

	@PostMapping("/")
	public int create(@RequestBody Rol rol) {
		// TODO Auto-generated method stub
		return rs.create(rol);
	}

	@PutMapping("/")
	public int update(@RequestBody Rol rol) {
		// TODO Auto-generated method stub
		return rs.update(rol);
	}

	@PutMapping("/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return rs.delete(id);
	}

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return rs.readAll();
	}

	@GetMapping("/{id}")
	public List<Map<String, Object>> readById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return rs.readById(id);
	}
	
	

	
}
