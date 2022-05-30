package com.entelgy.payload.service;

import java.net.URISyntaxException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsumoTest {

	Consumo consumo = new Consumo();
// QUE NO CONECTE A INTERNET sacar la inicializacion afuera del NOTEST
	/*@Test
	void verificarRespuesta_obteniendo_pagina_1() throws URISyntaxException {
		Assertions.assertEquals(1, consumo.consumir().getPage());
	}

	@Test
	void testVerificarNulo() throws URISyntaxException {
		if (consumo != null)
			Assertions.assertNotNull(consumo.consumir());
	}*/
}
