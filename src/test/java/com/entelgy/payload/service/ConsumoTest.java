package com.entelgy.payload.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.entelgy.payload.dto.DataEntrada;

class ConsumoTest {

	Consumo mockConsumo = Mockito.mock(Consumo.class);
	DataEntrada dataEntrada = new DataEntrada();

// QUE NO CONECTE A INTERNET sacar la inicializacion afuera del NOTEST

	@BeforeEach
	void antesde() {
		dataEntrada.setPage(1);
		Mockito.when(mockConsumo.consumir()).thenReturn(dataEntrada);
	}

	@Test
	void testRespuesta_obteniendo_pagina_1() {
		Assertions.assertEquals(1, mockConsumo.consumir().getPage());
	}
	@Test
	void testVerificarConsumir() {
		dataEntrada=mockConsumo.consumir();
		Mockito.verify(mockConsumo).consumir();
	}
}
