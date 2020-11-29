package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.TrabajadorDao;
import com.code.sysPedidos_backend.Entity.Trabajador;

@Repository
public class TrabajadorDaoImp implements TrabajadorDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int create(int idEmp, int idUsu,int idRol) {
		// TODO Auto-generated method stub
		String SQL="insert into trabajador(idEmpresa,idUsuario,idRol) values (?,?,?)";
		return jdbc.update(SQL, idEmp, idUsu, idRol);
	}

	@Override
	public int update(int idEmp, int idUsu,int idRol, int id) {
		// TODO Auto-generated method stub
		String SQL="update trabajador set idEmpresa = ?, idUsuario =?, idRol=?  where idTrabajador = ?";
		return jdbc.update(SQL,idEmp, idUsu, idRol,id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL="delete from  trabajador where idTrabajador = ?";
		return jdbc.update(SQL,id);
	}

	@Override
	public List<Map<String, Object>> readAll(int idEmp) {
		// TODO Auto-generated method stub
		String SQL="select * from trabajador where idEmpresa = ?";
		return jdbc.queryForList(SQL, idEmp);
	}

	@Override
	public List<Map<String, Object>> readById(int id) {
		// TODO Auto-generated method stub
		String SQL ="select * from trabajador where idTrabajador = ?";
		return jdbc.queryForList(SQL,id);
	}

}
