package com.entelgy.payload.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import com.entelgy.payload.dto.DataEntrada;

public class Consumo {
	@Autowired
	private RestTemplate restTemplate;
	private String ruta;

	public DataEntrada consumir() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);

		DataEntrada result = null;

		try {
			ResponseEntity<DataEntrada> responseJson = restTemplate
					.exchange(
							ruta,
							HttpMethod.GET,
							entity,
							DataEntrada.class);
			result = responseJson.getBody();
		} catch (RestClientException e) {
			String msg = "Error de conexion capturado en Consumo";
			System.out.println(msg + " --- " + e.getMessage());
		}
		return result;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
}
