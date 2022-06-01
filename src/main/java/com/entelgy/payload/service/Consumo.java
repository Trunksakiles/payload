package com.entelgy.payload.service;

import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataEntradaFail;

public class Consumo {

	String ruta = "";
	DataEntradaFail fail;
	// RestTemplate restTemplate = new RestTemplate();
	RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
	public DataEntrada consumir() {

		// Anular el tiempo de espera con SimpleClientHttpRequestFactory
////		RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

		// Data_entrada responseJson =
		// restTemplate.getForObject("https://reqres.in/api/users", Data_entrada.class);
		// hacer funcionar para reemplazar los de abajo-- ojo en java 8 se debe colocar
		// el setcontext type

		HttpHeaders headers = new HttpHeaders();

		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		// ResponseEntity<DataEntrada> responseJson= new ResponseEntity<DataEntrada>;
		ResponseEntity<DataEntrada> responseJson = new ResponseEntity<DataEntrada>(HttpStatus.OK);
		try {
			responseJson = restTemplate.exchange(ruta, HttpMethod.GET, entity, DataEntrada.class);
		} catch (RestClientException e) {
			String msg = "Error de conexion capturado en Consumo";
			System.out.println(msg + " --- " + e.getMessage());
		}
		return responseJson.getBody();
	}

	// Sobreescribir timeouts en request factory
	private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(3000);
		clientHttpRequestFactory.setReadTimeout(2000);
		return clientHttpRequestFactory;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
}
