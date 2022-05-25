package com.entelgy.payload.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Tiempo;

class UserControllerTest {

	private UserController userController;
	DataSalida dataSalida;
	void inicializarUserController() {
		userController = new UserController();
	}

	void inicializarDataSalida() {
		dataSalida = new DataSalida();
	}

	@Test
	void testVerificarRespuesta() throws URISyntaxException {
		inicializarUserController();
		inicializarDataSalida();
		Assertions.assertEquals(dataSalida, userController.pasar());
	}

	@Test
	void testVerificarNulo() throws URISyntaxException {
		inicializarUserController();
		Assertions.assertNotNull(userController.pasar());
	}

}
