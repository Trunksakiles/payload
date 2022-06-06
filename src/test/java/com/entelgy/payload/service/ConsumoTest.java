package com.entelgy.payload.service;

import com.entelgy.payload.dto.DataEntrada;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class ConsumoTest {
	
	    @InjectMocks
	    Consumo consumo;

	    @Mock
	    RestTemplate restTemplate;

	    private final String RUTA = "rrr";
	    private final DataEntrada DATA_ENTRADA = new DataEntrada();

	    @Mock
	    ResponseEntity responseEntity;

	    @Before
	    public void setUp() {
	        consumo.setRuta(RUTA);

	        Mockito.when(responseEntity.getBody()).thenReturn(DATA_ENTRADA);

	        Mockito.when(restTemplate.exchange(
	                Mockito.eq(RUTA),
	                Mockito.eq(HttpMethod.GET),
	                Mockito.any(HttpEntity.class),
	                Mockito.eq(DataEntrada.class)))
	                .thenReturn(responseEntity);
	    }

	    @Test
	    public void consumir() {
	    	DataEntrada dataEntrada = consumo.consumir();

	        assertNotNull(dataEntrada);
	        assertEquals(DATA_ENTRADA, dataEntrada);
	    }

	    @Test
	    public void consumirConError() {
	        RestClientException restClientException = new RestClientException("dwfdwqfwedffwe");
	        Mockito.when(restTemplate.exchange(
	                        Mockito.eq(RUTA),
	                        Mockito.eq(HttpMethod.GET),
	                        Mockito.any(HttpEntity.class),
	                        Mockito.eq(DataEntrada.class)))
	                .thenThrow(restClientException);

	        DataEntrada dataEntrada = consumo.consumir();

	        assertNull(dataEntrada);
	    }
}
