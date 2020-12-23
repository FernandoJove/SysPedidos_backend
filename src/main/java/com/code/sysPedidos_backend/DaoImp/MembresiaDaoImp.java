package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.MembresiaDao;
import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Membresia;

@Repository
public class MembresiaDaoImp implements MembresiaDao{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="select m.fecha_inicio,m.fecha_fin,e.NomEmpresa, e.estado from membresia as m,empresa e where m.idEmpresa = e.idEmpresa; ";
		return jdbc.queryForList(SQL);
	}

	@Override
	public int create(Membresia mem,int id) {

		String SQL ="insert into Empresa(fecha_inicio,fecha_fin,idEmpresa) values(?,?,?)";
		return jdbc.update(SQL,mem.getFecha_inicio(),mem.getFecha_fin(),id);
	}

	@Override
	public List<Membresia> readAll2() {
		return jdbc.query("SELECT m.idmembresia,e.nomempresa, m.fecha_inicio, m.fecha_fin, m.estado, m.idempresa FROM membresia m, empresa e where m.idempresa = e.idempresa;", BeanPropertyRowMapper.newInstance(Membresia.class));
		
	}

}
