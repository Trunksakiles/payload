package com.entelgy.payload.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;
@Service("tiempo")
public class Tiempo {

	public String obtenerFecha() {
	Date fecha = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); 
	String fechaTexto =new String("s");
	fechaTexto= formatter.format(fecha);
	return fechaTexto;
	}
}
