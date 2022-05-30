package com.entelgy.payload.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TiempoTest {

	Tiempo tiempo = Mockito.mock(Tiempo.class);
	/*
	 * Date date=Mockito.mock(Date.class);; SimpleDateFormat
	 * formatter=Mockito.mock(SimpleDateFormat.class);
	 */
//PROBAR TIEMPO COMO ENTRADA

	@BeforeEach
	void antesde() {
		// tiempo.setFecha(date);
		Mockito.when(tiempo.obtenerFecha()).thenReturn("2020/01/01T10:08:16");
		// Mockito.when(formatter.format(date)).thenReturn("2020/01/01 10:08:16");
	}

	@Test
	void testVerificarFecha() {
		String fechaTexto = tiempo.obtenerFecha();
		Assertions.assertEquals("2020/01/01T10:08:16", tiempo.obtenerFecha()/* .substring(0, 19) */);
	}

	@Test
	void testVerificarNulo() {
		Assertions.assertNotNull(tiempo.obtenerFecha());
	}
}
