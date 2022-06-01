package com.entelgy.payload.service;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TiempoTest {

	Tiempo tiempo = new Tiempo();
	Date date = Mockito.mock(Date.class);

	@BeforeEach
	void antesde() {
		tiempo.setFecha(date);
	}

	@Test
	void testFecha() {
		Assertions.assertEquals("1969-12-31T19:00:00-0500", tiempo.obtenerFecha());
	}

	@Test
	void testNulo() {
		Assertions.assertNotNull(tiempo.obtenerFecha());
	}

	/*
	 * @Test void testVerificarIteracciones() { //Mockito.verify(tiempo,
	 * Mockito.atLeastOnce()).obtenerFecha();
	 * Mockito.verify(tiempo).obtenerFecha(); Mockito.verify(mockTiempo,
	 * Mockito.atLeastOnce()).obtenerFecha(); Mockito.verify(mockTiempo,
	 * Mockito.atMost(10)).obtenerFecha(); }
	 */
}
