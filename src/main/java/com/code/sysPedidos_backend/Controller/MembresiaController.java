package com.code.sysPedidos_backend.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Membresia;
import com.code.sysPedidos_backend.Service.MembresiaService;

@RestController
@RequestMapping("/membresia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MembresiaController {
	
	@Autowired
	private MembresiaService mens;

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return mens.readAll();
	}

	@PostMapping("/{id}")
	public int create(Membresia mem, int id) {
		// TODO Auto-generated method stub
		return mens.create(mem, id);
	}
	@GetMapping("/readall")
	public List<Membresia> readList(){
		return mens.readAll2();
	}
	
}
