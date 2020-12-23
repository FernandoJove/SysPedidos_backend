package com.code.sysPedidos_backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.code.sysPedidos_backend.Dao.MembresiaDao;
import com.code.sysPedidos_backend.Dao.MenuDao;
import com.code.sysPedidos_backend.Dao.PersonaDao;
import com.code.sysPedidos_backend.Service.MenuService;

@SpringBootTest
class SysPedidosBackendApplicationTests {

	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {

		System.out.println(passwordEncoder.encode("123"));
	}

}
