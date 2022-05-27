package com.entelgy.payload.service;

import java.net.URISyntaxException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataSalida;

class MapeoTest {
	
	/*Tiempo tiempoMock=Mockito.mock(Tiempo.class);
	Consumo consumoMock=Mockito.mock(Consumo.class);
	Mapeo mapeo=new Mapeo(tiempoMock, consumoMock);*/
	
	@InjectMocks
	private Mapeo mapeo;

	
	//private Tiempo tiempo/*=new Tiempo()*/;
	@Mock
	Tiempo mockTiempo; /*= Mockito.mock(Tiempo.class);*/
	//Tiempo tiempo =new Tiempo();
	@Mock
	Consumo mockConsumo; /*= Mockito.mock(Consumo.class);*/
	//Consumo consumo = new Consumo();
	/*DataEntrada mockDataEntrada = Mockito.mock(DataEntrada.class);
	DataEntrada dataEntrada = new DataEntrada();
	DataSalida mockDataSalida = Mockito.mock(DataSalida.class);*/
	
	@BeforeEach
	void setUp() {		
	
		Mockito.when(mockTiempo.obtenerFecha()).thenReturn("2022-05-24");
		//Mockito.when(mockConsumo.consumir().getPage()).thenReturn(1);
		//Mockito.when(mockConsumo.consumir()).thenReturn(mockDataEntrada);
		/*Mockito.when(mapeo.reestructurar_datos().getOperationDate()).thenReturn("2022-05-25");
		Mockito.when(mockConsumo.consumir().getPage()).thenReturn(1);
		Mockito.when(new DataSalida("2022-05-24", null)).thenReturn(MockDataSalida);*/
		//dataEntrada= consumo.consumir();
	}

	@Test
	
	void testVerificarRestupesta() throws URISyntaxException {
		/*String fechaTexto = tiempo.obtenerFecha();
		Assertions.assertEquals("2022-05-25", fechaTexto.substring(0, 10));*/ //si funciona
	//	mockDataEntrada= consumo.consumir();
		Assertions.assertEquals("2022-05-24",mockTiempo.obtenerFecha());
		//System.out.println(dataEntrada);
		
	}
	/*@Test
	void testVerificarNulo() throws URISyntaxException {
		Assertions.assertNotNull(mapeo.reestructurar_datos()) ;
	}*/
	
	
	
	
	
	
	
	
	
	
/*
	private Mapeo mapeo;
	
	//private Tiempo tiempo;
	@Autowired
	DataEntrada data_entrada;
	Tiempo tiempoMock=Mockito.mock(Tiempo.class);
	Consumo consumoMock=Mockito.mock(Consumo.class);
	
	List<User> mocListkData=new ArrayList<User>();	
	User mockUser1 =new User();
	User mockUser2 =new User();
	
	void inicializarMapeo() {
		mapeo =new Mapeo();

	}
	@BeforeEach
	void SetUp() throws URISyntaxException {		
		
		
		mockUser1.setId(1);
		mockUser1.setEmail("george.bluth@reqres.in");
		mockUser1.setFirst_name("george");
		mockUser1.setLast_name("bluth");
		mockUser1.setAvatar("https://reqres.in/img/faces/1-image.jpg");
		
		mockUser2.setId(1);
		mockUser2.setEmail("george.bluth@reqres.in");
		mockUser2.setFirst_name("george");
		mockUser2.setLast_name("bluth");
		mockUser2.setAvatar("https://reqres.in/img/faces/1-image.jpg");
		
			
		mocListkData.add(mockUser1);
		mocListkData.add(mockUser2);
		
		DatosExtra mockSupport=new DatosExtra();
		mockSupport.setUrl("https://reqres.in/#support-heading");
		mockSupport.setText("To keep ReqRes free, contributions towards server costs are appreciated!");
		
		DataEntrada mockDataEntrada=new DataEntrada();
		mockDataEntrada.setPage(1);
		mockDataEntrada.setPer_page(6);
		mockDataEntrada.setTotal(12);
		mockDataEntrada.setTotal_pages(2);
		mockDataEntrada.setData(mocListkData);
		mockDataEntrada.setSupport(mockSupport);
		
		Mockito.when(tiempoMock.obtenerFecha()).thenReturn("2022-05-24");
		Mockito.when(consumoMock.consumir()).thenReturn(mockDataEntrada);
	}
	*/
	/*
	@Test
	void testVerificarMapeo() throws URISyntaxException {
		//inicializarMapeo();
		
		DataSalida data_salida=new DataSalida(null, null);
		Assertions.assertNotNull(mapeo.reestructurar_datos());
		data_salida = mapeo.reestructurar_datos();
		lista_data = data_salida.getData();
	
		Assertions.assertEquals("1|Bluth|george.bluth@reqres.in", lista_data.get(0));
		Assertions.assertEquals("2|Weaver|janet.weaver@reqres.in", lista_data.get(1));
		Assertions.assertEquals("3|Wong|emma.wong@reqres.in", lista_data.get(2));
		Assertions.assertEquals("4|Holt|eve.holt@reqres.in", lista_data.get(3));
		Assertions.assertEquals("5|Morris|charles.morris@reqres.in", lista_data.get(4));
		Assertions.assertEquals("6|Ramos|tracey.ramos@reqres.in", lista_data.get(5));
	       
	        
	        
	        
	        
			//Assertions.assertEquals("2022-05-24", data_salida.getData());
		
	}*/
}
