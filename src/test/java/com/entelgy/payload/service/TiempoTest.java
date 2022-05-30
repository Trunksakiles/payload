package com.entelgy.payload.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TiempoTest {

	Tiempo tiempo = new Tiempo();
//PROBAR TIEMPO COMO ENTRADA
	@Test
	void testVerificarFecha() {
		String fechaTexto = tiempo.obtenerFecha();
		Assertions.assertEquals("2022-05-27", fechaTexto.substring(0, 10));
	}

	@Test
	void testVerificarNulo() {
		Assertions.assertNotNull(tiempo.obtenerFecha());
	}
}
