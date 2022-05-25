package com.entelgy.payload.service;

import java.net.URISyntaxException;
import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.entelgy.payload.dto.DataEntrada;

@Service("consumo")
public class Consumo {

	public DataEntrada consumir() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();

		//Data_entrada responseJson = restTemplate.getForObject("https://reqres.in/api/users", Data_entrada.class);
		// hacer funcionar para reemplazar los de abajo

		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<DataEntrada> responseJson = restTemplate.exchange("https://reqres.in/api/users", HttpMethod.GET,
				entity, DataEntrada.class);

		return responseJson.getBody();
	}
}
