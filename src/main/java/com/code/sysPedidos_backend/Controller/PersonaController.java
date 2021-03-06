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

import com.code.sysPedidos_backend.Dao.PersonaDao;
import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonaController  {

	@Autowired
	private PersonaService ps;
	
	@PostMapping("/")
	public int create(@RequestBody Persona per) {
		// TODO Auto-generated method stub
		return ps.create(per);
	}

	@PutMapping("/")
	public int update(@RequestBody Persona per) {
		// TODO Auto-generated method stub
		return ps.update(per);
	}

	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return ps.delete(id);
	}

	@GetMapping("/{id}")
	public Persona read(@PathVariable int id) {
		// TODO Auto-generated method stub
		return ps.read(id);
	}

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ps.readAll();
	}

}
