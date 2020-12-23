package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.PersonaDao;
import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Persona;

@Repository
public class PersonaDaoImp implements PersonaDao{

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public int create(Persona per) {
		String SQL ="insert into persona (nombre, apellidos, edad, telefono, correo, DNI) VALUES (?,?,?,?,?,?);";
		return jdbc.update(SQL, new Object [] {per.getNombre(), per.getApellidos(), per.getEdad(), per.getTelefono(), per.getCorreo(), per.getDni()} );
	}

	@Override
	public int update(Persona per) {
		String SQL= "UPDATE persona SET nombre = ?, apellidos = ?, edad = ?, telefono = ?, correo = ?, DNI = ? where idpersona = ?";
		return jdbc.update(SQL, per.getNombre(), per.getApellidos(), per.getEdad(), per.getTelefono(), per.getCorreo(), per.getCorreo(), per.getIdpersona() );
	}

	@Override
	public int delete(int id) {
		String SQL= "DELETE from persona where idpersona = ?";
		return jdbc.update(SQL, new Object[] {id});
}

	@Override
	public Persona read(int id) {
		String SQL = "select * from persona where idpersona  = ?";
		return jdbc.queryForObject(SQL, new Object[] {id},new BeanPropertyRowMapper<Persona>(Persona.class) );
	}

	@Override
	public Persona readdni(String dni) {
		// TODO Auto-generated method stub
		String SQL = "select * from persona where DNI = ?";
		return jdbc.queryForObject(SQL, new Object[] {dni}, BeanPropertyRowMapper.newInstance(Persona.class));
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return jdbc.query("select * from persona", BeanPropertyRowMapper.newInstance(Persona.class));

	}

	

}
