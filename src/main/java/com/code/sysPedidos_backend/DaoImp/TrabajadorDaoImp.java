package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.TrabajadorDao;
import com.code.sysPedidos_backend.Entity.Trabajador;

@Repository
public class TrabajadorDaoImp implements TrabajadorDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int create(Trabajador trab) {
		// TODO Auto-generated method stub
		String SQL = "insert into trabajador (idempresa, idusuario, idrol, estado) values (?,?,?,1);";
		return jdbc.update(SQL, new Object[] {trab.getIdempresa(),trab.getIdusuario(),trab.getIdrol()} );
	}

	@Override
	public int update(Trabajador trab) {
		// TODO Auto-generated method stub

		String SQL = "update trabajador set idempresa = ?, idusuario=?, idrol=?,estado=? where idtrabajador=?;";
		return jdbc.update(SQL, trab.getIdempresa(),trab.getIdusuario(),trab.getIdrol(),trab.getEstado(),trab.getIdtrabajador());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL= "delete from trabajador where idtrabajador = ?;";
		return jdbc.update(SQL, new Object[] {id});
	}

	@Override
	public int cambiarestado(Trabajador trab) {
		// TODO Auto-generated method stub
		String SQL = "update trabajador set estado = ? where idtrabajador =?;";
		return jdbc.update(SQL, trab.getEstado(),trab.getIdtrabajador());
	}

	@Override
	public List<Map<String, Object>> readAll(int idemp) {
		// TODO Auto-generated method stub
		String SQL = "select * from trabajador where idempresa = ?;";
		return jdbc.queryForList(SQL,idemp);
	}

	@Override
	public Trabajador read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from trabajador where idtrabajador = ?;";
		return jdbc.queryForObject(SQL, new Object[] {id}, BeanPropertyRowMapper.newInstance(Trabajador.class));
	}

	@Override
	public List<Trabajador> readAll2() {
		// TODO Auto-generated method stub
		return jdbc.query("SELECT p.DNI,u.username, r.nomrol, e.nomempresa, t.estado, t.idtrabajador  FROM empresa e, usuario u, rol r, trabajador t, persona p where t.idempresa = e.idempresa and t.idrol = r.idrol and t.idusuario = u.idusuario and u.idpersona = p.idpersona;", BeanPropertyRowMapper.newInstance(Trabajador.class));
	}

}
