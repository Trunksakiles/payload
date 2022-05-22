package com.entelgy.payload.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tiempo {

	public String obtenerfecha() {
	Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/ddHH:mm:ssZ"); 
	String fechaTexto = formatter.format(fecha);
	return fechaTexto;
	}
}
