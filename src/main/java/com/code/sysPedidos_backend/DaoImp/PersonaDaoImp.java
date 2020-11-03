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
		String SQL ="insert into Empresa(Nombre,Apellidos,Edad,Telefono,Correo,DNI) values(?,?,?,?,?,?)";
		return jdbc.update(SQL,per.getNombre(),per.getApellidos(),per.getEdad(),per.getTelefono(),per.getCorreo(),per.getDni()	);
	}

	@Override
	public int update(Persona per) {
		String SQL= "UPDATE Empresa SET Nombre = ?,Apellidos = ?,Edad = ?, Telefono = ?, Correo = ?,DNI = ?";
		return jdbc.update(SQL,per.getNombre(),per.getApellidos(),per.getEdad(),per.getTelefono(),per.getCorreo(),per.getDni());
	}

	@Override
	public int delete(int id) {
		String SQL= "delete from Persona where idPersona = ?";
		return jdbc.update(SQL,id);
	}

	@Override
	public Empresa read(int id) {
		String SQL = "select * from Persona where idPersona  = ?";
		return jdbc.queryForObject(SQL, new Object[] {id},new BeanPropertyRowMapper<Empresa>(Empresa.class) );
	}

	@Override
	public List<Map<String, Object>> readAll() {

		String SQL = "select * from Persona";
		return jdbc.queryForList(SQL);
	}

}
