package com.entelgy.payload;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.entelgy.payload.bean.Data_salida;
import com.entelgy.payload.service.Tiempo;

public class TiempoTest {

	
	@Test
	void verificarfecha() {
		
		
		Tiempo time=new Tiempo();
		
		Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/ddHH:mm:ssZ"); 
		String fechaTexto = formatter.format(fecha);
		
		Assertions.assertEquals("2022/05/22", fechaTexto.substring(0, 10));
		
	}
	
	
}
