package com.entelgy.payload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.payload.dto.DataEntradaFail;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Mapeo;

@RestController
public class UserController {
	@Autowired
	private Mapeo mapeo;

	@PostMapping("/pasar")
	public DataSalida pasar() {
		DataSalida dataSalida = mapeo.reestructurar_datos();
		if (dataSalida == null) {
			throw new DataEntradaFail("Tiempo agotado para la solicitud");
		}
		return dataSalida;
	}

	public void setMap(Mapeo map) {
		this.mapeo = map;
	}
}
