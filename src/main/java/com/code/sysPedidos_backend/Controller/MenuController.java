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


import com.code.sysPedidos_backend.Entity.Menu;
import com.code.sysPedidos_backend.Service.MenuService;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MenuController {

	@Autowired
	private MenuService ms;
	@PostMapping("/{id}")
	public int create(@RequestBody Menu menu, @PathVariable int id) {
		// TODO Auto-generated method stub
		return ms.create(menu, id);
	}

	@PutMapping("/")
	public int update(@RequestBody Menu menu) {
		// TODO Auto-generated method stub
		return ms.update(menu);
	}

	@DeleteMapping("/")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return ms.delete(id);
	}

	@GetMapping("/")
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ms.readAll();
	}

	@GetMapping("/{id}")
	public List<Map<String, Object>> selectByEmpresa(@PathVariable int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return ms.selectByEmpresa(id);
	}

}
