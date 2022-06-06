package com.entelgy.payload.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiempo {

	public String obtenerFormatoFecha(Date fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		return formatter.format(fecha);
	}
}
