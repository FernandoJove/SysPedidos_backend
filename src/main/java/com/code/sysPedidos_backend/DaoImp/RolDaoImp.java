package com.code.sysPedidos_backend.DaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.RolDao;
import com.code.sysPedidos_backend.Entity.Rol;
@Repository
public class RolDaoImp implements RolDao{
	
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		String SQL =" insert into rol(nomrol,estado) values (?,?)";
		return jdbc.update(SQL);
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		String SQL ="update rol set nomrol = ?, estado = ? where idrol = ? ";
		return jdbc.update(SQL);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL ="update rol set estado = 0 where idrol";
		return jdbc.update(SQL);
	}

	

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL =" select * from rol where estado = 1";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readById(int id) {
		// TODO Auto-generated method stub
		String SQL ="select * from rol where estado = 1 and idrol  = ?";
		return jdbc.queryForList(SQL);
	}

	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		// TODO Auto-generated method stub
	
	List<GrantedAuthority> autores = new ArrayList<GrantedAuthority>();
	String SQL="select r.idrol,r.nomrol from usuario as u, trabajador as t, rol as r where r.idrol=t.idrol and t.idusuario = u.idusuario and u.idusuario = ? ";
	List<Rol> roles = jdbc.query(SQL, new Object[]{iduser}, new BeanPropertyRowMapper<Rol>(Rol.class));
	
			for(int i=0;i<roles.size();i++) {		
				autores.add(new SimpleGrantedAuthority(roles.get(i).getNomrol()));
			}
			
			System.out.println("soy autores" + autores);
		return autores;
	}

}
