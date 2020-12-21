package com.code.sysPedidos_backend.DaoImp;

import java.sql.SQLData;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Usuario;
import com.google.gson.Gson;


@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private JdbcTemplate jdbc;
	
	Gson g = new Gson();

	@Override
	public int create(Usuario us,int id) {
		String SQL ="insert into Usuario(Nomuser,Passuser,Estado,idPersona)values(?,?,?,?);  ";
		return jdbc.update(SQL,us.getUsername(),us.getPassword(),us.getEstado(),id);
	}

	@Override
	public int update(Usuario us) {
		// TODO Auto-generated method stub
		String SQL ="update user set nomuser = ?, passuser =?";
		return jdbc.update(SQL, us.getUsername(), us.getPassword());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL=" update user set estado = 0 where idUsuario = ?";
		return jdbc.update(SQL, id);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM usuario WHERE username=?";
		return jdbc.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));

	}

	@Override
	public Map<String, Object> datos(String username) {
		// TODO Auto-generated method stub
		String SQL="select p.nombre,p.apellidos,p.edad,p.telefono,p.correo,p.dni,r.nomrol from persona as p, usuario as u, trabajador as t,rol as r where u.idusuario=t.idusuario and t.idrol =r.idrol and p.idpersona =u.idpersona and u.username = ? ";
				Map<String,Object> map = jdbc.queryForMap(SQL,username);
		return map;
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		String SQL="select  * from usuario where username = ?";
		Usuario usuario = jdbc.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		System.out.println("Prueba: "+g.toJson(usuario));
		return usuario;
	}
	
}
