package com.entelgy.payload.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TiempoTest {

	Tiempo mockTiempo = Mockito.mock(Tiempo.class);
	/*
	 * Date date=Mockito.mock(Date.class);; SimpleDateFormat
	 * formatter=Mockito.mock(SimpleDateFormat.class);
	 */
//PROBAR TIEMPO COMO ENTRADA

	@BeforeEach
	void antesde() {
		// tiempo.setFecha(date);
		Mockito.when(mockTiempo.obtenerFecha()).thenReturn("2020/01/01T10:08:16");
		// Mockito.when(formatter.format(date)).thenReturn("2020/01/01 10:08:16");
	}

	@Test
	void testFecha() {
		String fechaTexto = mockTiempo.obtenerFecha();
		Assertions.assertEquals("2020/01/01T10:08:16", mockTiempo.obtenerFecha());
	}

	@Test
	void testNulo() {
		Assertions.assertNotNull(mockTiempo.obtenerFecha());
	}

	@Test
	void testVerificarObtenerFecha() {
		String fechaTexto = mockTiempo.obtenerFecha();
		Mockito.verify(mockTiempo).obtenerFecha();
		Mockito.verify(mockTiempo, Mockito.atLeastOnce()).obtenerFecha();
	}
	/*
	 * @Test void testVerificarIteracciones() {
	 * 
	 * Mockito.verify(mockTiempo, Mockito.atLeastOnce()).obtenerFecha();
	 * Mockito.verify(mockTiempo, Mockito.atMost(10)).obtenerFecha(); }
	 */
}
