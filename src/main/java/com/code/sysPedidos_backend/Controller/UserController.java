package com.code.sysPedidos_backend.Controller;

import java.util.List;

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

import com.code.sysPedidos_backend.Entity.Usuario;
import com.code.sysPedidos_backend.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService Uservice;
	@PostMapping("/add")
	public int create(@RequestBody Usuario us) {
		// TODO Auto-generated method stub
		return Uservice.create(us);
	}

	@PutMapping("/update/{id}")
	public int update(@RequestBody Usuario us,@PathVariable int id) {
		// TODO Auto-generated method stub
		us.setIdusuario(id);
		return Uservice.update(us);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return Uservice.delete(id);
	}
	@GetMapping("/readall")
	public List<Usuario> readList(){
		return Uservice.readAll();
	}
	@GetMapping("/read/{id}")
	public Usuario readid (@PathVariable int id) {
		return Uservice.readid(id);
	}
	@GetMapping("/readdni/{dni}")
	public Usuario readdni (@PathVariable String dni) {
		return Uservice.readdni(dni);
	}
	@PutMapping("/updateestado/{id}")
	public int cambiarestado (@RequestBody Usuario us, @PathVariable int id) {
		us.setIdusuario(id);
		return Uservice.cambiarestado(us);
	}
	
}
