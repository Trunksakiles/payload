package com.entelgy.payload.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class MapeoTest {

	Tiempo mockTiempo = Mockito.mock(Tiempo.class);
	Consumo consumo = new Consumo();
	Mapeo mapeo = new Mapeo(); //mockTiempo, consumo);
	//DataSalida dataSalida = new DataSalida("2022-05-27", null);

	@BeforeEach
	void setUp() {
		//Mockito.when(mockTiempo.obtenerFecha()).thenReturn("2020-01-01T10:08:16-0500");
	}

	@Test
	void testVerificarRestupesta() {
		Assertions.assertEquals("2020-01-01T10:08:16-0500", mapeo.reestructurar_datos().getOperationDate());
	}

	@Test
	void testVerificarNulo() {
		Assertions.assertNotNull(mapeo.reestructurar_datos());
	}
}
