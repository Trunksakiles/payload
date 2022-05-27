package com.entelgy.payload.controller;

import java.net.URISyntaxException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Mapeo;

class UserControllerTest {
	
	Mapeo mapeo;
	DataSalida dataSalida;
	UserController userController;
	@Autowired
	public UserControllerTest(Mapeo mapeo,DataSalida dataSalida,UserController userController) {
		this.mapeo=mapeo;
		this.dataSalida=dataSalida;
		this.userController=userController;
	}	

	@Test
	void testVerificarRespuesta() throws URISyntaxException {

		Assertions.assertEquals(dataSalida, userController.pasar());
	}

	@Test
	void testVerificarNulo() throws URISyntaxException {
		Assertions.assertNotNull(userController.pasar());
	}

}
