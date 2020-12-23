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

import com.code.sysPedidos_backend.Entity.Trabajador;
import com.code.sysPedidos_backend.Service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService trabService;
	
	@PostMapping("/add")
	public int create (@RequestBody Trabajador trab) {
		
		return trabService.create(trab);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Trabajador trab, @PathVariable int id) {
		trab.setIdtrabajador(id);
		return trabService.update(trab);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return trabService.delete(id);
	}
	@PutMapping("/updateestado/{id}")
	public int cambiarestado (@RequestBody Trabajador trab, @PathVariable int id) {
		trab.setIdtrabajador(id);
		return trabService.cambiarestado(trab);
	}
	@GetMapping("/readall/{idemp}")
	public List<Map<String, Object>> readAll(@PathVariable int idemp){
		return trabService.readAll(idemp);
	}
	@GetMapping("/readall2")
	public List<Trabajador> readList(){
		return trabService.readAll2();
	}
	@GetMapping("/read/{id}")
	public Trabajador read(@PathVariable int id) {
		return trabService.read(id);
	}
	
	

}
