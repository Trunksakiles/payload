package com.entelgy.payload.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientException;

import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataEntradaFail;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.dto.User;

@RunWith(MockitoJUnitRunner.class)
public class MapeoTest {

	@InjectMocks
	Mapeo mapeo;

	@Mock
	Tiempo mockTiempo;
	
	@Mock
	Consumo mockConsumo;
	Consumo mockConsumo2;
	@Mock
	DataEntrada dataEntrada; // = new DataEntrada();
	
	@Mock
	List<String> lista_string = new ArrayList<String>();
	
	@Mock
	Date date;
		
	@Mock
	DataSalida dataSalida; 
	
	private String fecha_en_datasalida;
	private String strdata;
	
	
	//private String fechaEntrada; // = "2022-06-02T11:47:00-0500";
	//private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	//private String fechaSalida;	
	
	@Before
	public void setUp() {
		List<User> lista_user = new ArrayList<User>();
		User user1 =new User();
		User user2= new User();
		user1.setId(1);
		user1.setLast_name("lastname1")
		;user1.setEmail("lastname1@gmail");
		user2.setId(2);
		user2.setLast_name("lastname2");
		user2.setEmail("lastname2@gmail");
		lista_user.add(user1);
		lista_user.add(user2);
		//Mockito.when(calendar.getInstance().getTime()).thenReturn(date);
		//DataSalida x=new DataSalida(fecha_en_datasalida, lista_string);
		Mockito.when(mockTiempo.obtenerFormatoFecha(date)).thenReturn(fecha_en_datasalida);
		Mockito.when(mockConsumo.consumir()).thenReturn(dataEntrada);
		Mockito.when(dataEntrada.getData()).thenReturn(lista_user);
		//Mockito.when(lista_string.add(strdata)).thenReturn(true);
	//DATASALIDA=new DataSalida(strfecha, lista_string);
		//dataSalida2=DATASALIDA;
		//DataSalida DATASALIDA =new DataSalida(operationDate, data);
		//Mockito.when(dataSalida(fecha_en_datasalida, lista_string)).thenReturn(DATASALIDA);
	
	}

	@Test
	public void testVerificarRespesta() throws ParseException {
	
	
		DataSalida dataSalida = mapeo.reestructurar_datos();
		lista_string=dataSalida.getData();
		DataSalida DATASALIDA =new DataSalida(null,null );
		DATASALIDA.setData(lista_string);
		DATASALIDA.setOperationDate(fecha_en_datasalida);
		assertNotNull(dataSalida);
		assertEquals(DATASALIDA.getData(), dataSalida.getData());
		//Mockito.verify(lista_string.add(strdata),Mockito.times(lista_user.size()));
		// Assertions.assertEquals("2020-01-01T10:08:16-0500", 
		// mapeo.reestructurar_datos().getOperationDate());
	}
	 @Test
	    public void testVerificarRespestaConError() {

	        assertThrows(NullPointerException.class,
		            ()->{
		            	//Consumo mockConsumo2= mockConsumo;
		            	//Mapeo mapeo2 = new Mapeo();
		            	//Consumo mockConsumo2=new Consumo(); //COMENTAR ESTO PARA QUE ME EXPLIQUEN COMO FUNCIONA
		            	//DataEntrada mockDataEntrada2=new DataEntrada();
		            	//NullPointerException nullPointerException=new NullPointerException("asd");
		            	//Mockito.when(mockTiempo.obtenerFormatoFecha(date)).thenThrow(nullPointerException);
		            	Mockito.when(mockConsumo.consumir()).thenThrow(new NullPointerException("asd"));
		            	//Mockito.when(mockConsumo2.consumir()).thenReturn(/*nullPointerException*/mockDataEntrada2);
		               	mapeo.reestructurar_datos();
		            });
	    }
}

