package com.entelgy.payload.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiempo {

	private Date fecha;

	public String obtenerFecha() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		return formatter.format(fecha);
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
