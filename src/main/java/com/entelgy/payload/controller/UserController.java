package com.entelgy.payload.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Consumo;
import com.entelgy.payload.service.Mapeo;
import com.entelgy.payload.dto.DataEntrada;

@RestController
public class UserController {
	
	@Autowired
	Mapeo map;
	
	@Autowired
	Consumo cons;

	@GetMapping("/user")
	public String ver() {
		return "funcionando";
	}

	@PostMapping("/pasar")
	public DataSalida pasar() throws URISyntaxException {
		return map.reestructurar_datos();
	}
}
