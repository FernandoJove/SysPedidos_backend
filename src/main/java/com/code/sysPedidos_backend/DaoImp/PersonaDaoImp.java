package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.PersonaDao;

@Repository
public class PersonaDaoImp implements PersonaDao{

	@Autowired
	private JdbcTemplate jdbc;


	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from persona";
		return jdbc.queryForList(SQL);
	}

}
