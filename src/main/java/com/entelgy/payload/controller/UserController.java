package com.entelgy.payload.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.payload.bean.User;
import com.entelgy.payload.service.Tiempo;
import com.entelgy.payload.bean.Data_reestructurada;
import com.entelgy.payload.bean.Data_salida;
import com.entelgy.payload.bean.Paypage;

@RestController
public class UserController {

	@GetMapping("/user")
	public String ver() {
		return "funcionando";
	}

	@PostMapping("/pasar")
	public Data_salida pasar(@RequestBody Paypage x) {
		Tiempo time = new Tiempo();

		List<Data_reestructurada> datos_extraidos = x.extraer_datos();
		String fechaTexto = time.obtenerfecha();
		
		Data_salida data_salida = new Data_salida(fechaTexto, datos_extraidos);
		return data_salida;
	}

	/*
	 * @PostMapping("/pasar1") public User pasar1(@RequestBody User x) { //paypage
	 * s=x; return x; }
	 */

}
