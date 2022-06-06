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
		DataSalida dataSalida = null;
		try {
			dataSalida = mapeo.reestructurar_datos();
		} catch (NullPointerException e) {
			throw new DataEntradaFail("Tiempo agotado para la solicitud");
		}
		return dataSalida;
	}

	/*
	 * @RequestMapping(path ="/link", produces = MediaType.APPLICATION_JSON_VALUE)
	 * accept
	 * 
	 * @RequestMapping(path ="/l", produces = MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * @PutMapping(path="link", consumes = MediaType.APPLICATION_JSON_VALUE)
	 */
	public void setMapeo(Mapeo mapeo) {
		this.mapeo = mapeo;
	}

}
