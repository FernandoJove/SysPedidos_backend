package com.code.sysPedidos_backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.sysPedidos_backend.Dao.PersonaDao;

@SpringBootTest
class SysPedidosBackendApplicationTests {
	@Autowired
	private PersonaDao pdao;

	@Test
	void contextLoads() {
		System.out.println(pdao.readAll());
	}

}
