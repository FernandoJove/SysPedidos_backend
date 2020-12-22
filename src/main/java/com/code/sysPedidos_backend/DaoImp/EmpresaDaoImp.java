package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.EmpresaDao;
import com.code.sysPedidos_backend.Entity.Empresa;

@Repository
public class EmpresaDaoImp implements EmpresaDao{
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int create(Empresa emp) {
		String SQL ="insert into Empresa(NomEmpresa,RUC,RazonSocial,Estado,Direccion) values(?,?,?,?,?)";
		return jdbc.update(SQL,emp.getNomEmpresa(),emp.getRUC(),emp.getRazonSocial(),emp.getEstado(),emp.getDireccion());
	}

	@Override
	public int update(Empresa emp) {
		String SQL= "UPDATE Empresa SET NomEmpresa = ?,RUC = ?,RazonSocial = ?, Estado = ?, Direccion = ?";
		return jdbc.update(SQL,emp.getNomEmpresa(),emp.getRUC(),emp.getRazonSocial(),emp.getEstado(),emp.getDireccion());
	}

	@Override
	public int delete(int id) {
		String SQL= "delete from Empresa where idEmpresa = ?";
		return jdbc.update(SQL,id);
	}

	@Override
	public Empresa read(int id) {
		String SQL = "select * from empresa where idEmpresa  = ?";
		return jdbc.queryForObject(SQL, new Object[] {id},new BeanPropertyRowMapper<Empresa>(Empresa.class) );
	}

	@Override
	public List<Map<String, Object>> readAll() {

		String SQL = "select * from empresa";
		return jdbc.queryForList(SQL);
	}

	
}
