package com.code.sysPedidos_backend.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.sysPedidos_backend.Dao.RolDao;
import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Usuario;
import com.google.gson.Gson;


@Service("userService")
public class UsuarioService implements UserDetailsService {
	Gson g = new Gson();
	@Autowired
	private UserDao ud;
	@Autowired
	private RolDao rd;
	   
		@Override
		@Transactional(readOnly = true)
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		Usuario usuario = ud.validarUsuario(username);
		System.out.println(g.toJson(usuario));
			System.out.println(g.toJson(rd.buscarRolUser(usuario.getIdusuario())));
	
			System.out.println("hola soy username" + username);
			System.out.println("Soy antes de details"+ usuario.getPassword());
		
		
			
			return new User(usuario.getUsername(),usuario.getPassword(),rd.buscarRolUser(usuario.getIdusuario()));
		
			
		}
}