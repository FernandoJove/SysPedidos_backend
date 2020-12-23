package com.code.sysPedidos_backend.DaoImp;

import java.sql.SQLData;
import java.util.List;
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
	public int update(Usuario us) {
		// TODO Auto-generated method stub
		String SQL ="update usuario set username = ?, password =? where idusuario = ?";
		return jdbc.update(SQL, us.getUsername(), us.getPassword(),us.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL=" delete from usuario where (idusuario=?)";
		return jdbc.update(SQL, new Object[] {id});
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
		String SQL="select u.idusuario,p.nombre,p.apellidos,p.edad,p.telefono,p.correo,p.dni,r.nomrol from persona as p, usuario as u, trabajador as t,rol as r where u.idusuario=t.idusuario and t.idrol =r.idrol and p.idpersona =u.idpersona and u.username = ? ";
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

	@Override
	public int create(Usuario us) {
		String SQL ="insert into usuario (username, password, estado, idpersona)values(?,?,1,?);";
		return jdbc.update(SQL, new Object[] {us.getUsername(), us.getPassword(), us.getIdpersona()});
	}

	@Override
	public int cambiarestado(Usuario us) {
		// TODO Auto-generated method stub
		String SQL= "update usuario set estado = ? where idusuario =?;";
		return jdbc.update(SQL, us.getEstado(),us.getIdusuario());
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return jdbc.query("Select * from usuario", BeanPropertyRowMapper.newInstance(Usuario.class));
	}

	@Override
	public Usuario readid(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where idusuario = ?;";
		return jdbc.queryForObject(SQL, new Object[] {id}, BeanPropertyRowMapper.newInstance(Usuario.class));
	}

	@Override
	public Usuario readdni(String dni) {
		// TODO Auto-generated method stub
		String SQL = "SELECT u.username, u.idUsuario from usuario u, persona p where u.idPersona = p.idPersona and p.dni = ? ;";
		return jdbc.queryForObject(SQL, new Object[] {dni}, BeanPropertyRowMapper.newInstance(Usuario.class));
	}
	
}
