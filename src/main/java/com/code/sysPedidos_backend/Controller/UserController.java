package com.code.sysPedidos_backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Usuario;
import com.code.sysPedidos_backend.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService Uservice;

	@PostMapping("/{id}")
	public int create(@RequestBody Usuario us, @PathVariable int id) {
		// TODO Auto-generated method stub
		return Uservice.create(us, id);
	}

	@PutMapping("/")
	public int update(@RequestBody Usuario us) {
		// TODO Auto-generated method stub
		return Uservice.update(us);
	}

	@PutMapping("/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Uservice.delete(id);
	}

}
