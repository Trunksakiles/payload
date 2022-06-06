package com.entelgy.payload.controller;

import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.junit.MockitoJUnitRunner;
import com.entelgy.payload.dto.DataEntradaFail;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.service.Mapeo;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	@InjectMocks
	UserController userController; 
	@Mock
	Mapeo mockMapeo;
	DataSalida dataSalidaStub = new DataSalida("2022-05-27", null);
	//DataSalida dataSalida=null;
	DataSalida x;

	@Before
	public void setUp() {
		Mockito.when(mockMapeo.reestructurar_datos()).thenReturn(dataSalidaStub);
	}

	@Test
	public void testVerificarRespuesta() {
		DataSalida dataSalida=userController.pasar();
		assertEquals(dataSalidaStub, dataSalida);
		assertNotNull(dataSalida);
		//assertEquals("2022-05-27", userController.pasar().getOperationDate());
		assertThrows(DataEntradaFail.class,
	            ()->{
	            	Mockito.when(mockMapeo.reestructurar_datos()).thenReturn(null);
	            	userController.pasar();
	            });
	}

	/*@Test
	public void testPasarConError() {
		DataEntradaFail dataEntradaFail=new DataEntradaFail("");		
		Mockito.when(mockMapeo.reestructurar_datos()).thenReturn(null);
		String strError="error capturado"; 
		
	     try {
	    	 DataSalida dataSalida=userController.pasar();
	    } catch (DataEntradaFail e) {
	    	dataEntradaFail=new DataEntradaFail(strError);	
	    }
	     
	     assertEquals(strError,dataEntradaFail.getMessage());
	}*/
	
	/*@Test
	public void itShouldThrowNullPointerExceptionWhenBlahBlah() {
	    assertThrows(DataEntradaFail.class,
	            ()->{
	            	Mockito.when(mockMapeo.reestructurar_datos()).thenReturn(null);
	            	//DataSalida dataSalida=
						userController.pasar();
	            });
	}*/
}
