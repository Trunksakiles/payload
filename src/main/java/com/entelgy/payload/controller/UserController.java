package com.entelgy.payload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.payload.configuration.Configuracion;
import com.entelgy.payload.dto.DataEntradaFail;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Mapeo;

@RestController
public class UserController {
	Mapeo map;

	@PostMapping("/pasar")
	public DataSalida pasar() {

		map = Configuracion.getConfiguracion().getMapeo();
		if (map.reestructurar_datos() == null)
			throw new DataEntradaFail("Tiempo agotado para la solicitud");
		return map.reestructurar_datos();
	}
}
