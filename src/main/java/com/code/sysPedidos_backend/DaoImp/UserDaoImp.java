package com.code.sysPedidos_backend.DaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.User;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public int create(User us,int id) {
		String SQL ="insert into User(Nomuser,Passuser,Estado,idPersona)values(?,?,?,?);  ";
		return jdbc.update(SQL,us.getNomuser(),us.getPassuser(),us.getEstado(),id);
	}
	
}
