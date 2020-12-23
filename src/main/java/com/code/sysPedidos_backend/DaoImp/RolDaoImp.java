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
		String SQL =" insert into rol(nomrol,estado) values (?,1);";
		return jdbc.update(SQL, new Object[] {rol.getNomrol()});
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		String SQL ="update rol set nomrol = ? where idrol = ?; ";
		return jdbc.update(SQL, rol.getNomrol(), rol.getIdrol());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL ="delete from rol where (idrol=?);";
		return jdbc.update(SQL, new Object[]{id});
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

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return jdbc.query("select * from rol", BeanPropertyRowMapper.newInstance(Rol.class));
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from rol where idrol = ?";
		return jdbc.queryForObject(SQL, new Object[]{id}, BeanPropertyRowMapper.newInstance(Rol.class));
	}

	@Override
	public int cambiarestado(Rol rol) {
		// TODO Auto-generated method stub
		String SQL = "update rol set estado = ? where idestado = ?;";
		return jdbc.update(SQL, rol.getEstado(),rol.getIdrol());
	}

}
