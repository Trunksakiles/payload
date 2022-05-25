package com.entelgy.payload.service;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataSalida;

class ConsumoTest {
Consumo consumo;
DataEntrada dataentrada;	
	void inicializarConsumo() {
		consumo =new Consumo();
	}
	void inicializarDataEntrada() {
		dataentrada =new DataEntrada();
	}
	
	@Test
	void verificarRespuesta() throws URISyntaxException {
		inicializarConsumo();
		inicializarDataEntrada();
			Assertions.assertEquals(dataentrada, consumo.consumir());
		}
	@Test
	void testVerificarNulo() throws URISyntaxException {
		inicializarConsumo();		
		Assertions.assertNotNull(consumo.consumir());
	}
}
