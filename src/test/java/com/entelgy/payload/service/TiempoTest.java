package com.entelgy.payload.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Tiempo;

public class TiempoTest {
	
	private Tiempo tiempo;
	
	void inicializarTiempo() {
		 tiempo =new Tiempo();

	}
	@Test
	void testVerificarFecha() {
		inicializarTiempo();
		String fechaTexto =tiempo.obtenerFecha();				
		Assertions.assertEquals("2022-05-25", fechaTexto.substring(0, 10));		
	}	
	@Test
	void testVerificarNulo() {
		inicializarTiempo();				
		Assertions.assertNotNull(tiempo.obtenerFecha());
	}	
}
