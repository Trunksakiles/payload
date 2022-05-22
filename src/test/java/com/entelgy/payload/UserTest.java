package com.entelgy.payload;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.entelgy.payload.bean.Data_reestructurada;
import com.entelgy.payload.bean.Data_salida;
import com.entelgy.payload.bean.Datos_extra;
import com.entelgy.payload.bean.Paypage;
import com.entelgy.payload.bean.User;
import com.entelgy.payload.controller.UserController;

public class UserTest {
	
	@Autowired
	List<User> lista_data_entera=new ArrayList<User>();
	Data_reestructurada mockdatarest=Mockito.mock(Data_reestructurada.class);
	@Autowired
	List<Data_reestructurada> mockListaEstructurada = new ArrayList<Data_reestructurada>();
	Datos_extra data_extra=Mockito.mock(Datos_extra.class);
	
	//Paypage x=new Paypage(1, 6, 12, 2, lista_data_entera, data_extra);
	Paypage paypage=Mockito.mock(Paypage.class);
	
	@Autowired
	UserController user_controller=new UserController();
	
	@BeforeEach
	void seTup() {
		User mockuser1 =new User(1, "george.bluth@reqres", "George", "Bluth", "https://reqres.in/img/faces/1-image.jpg");
		User mockuser2 =new User(2, "janet.weaver@reqres.in", "Janet", "Weaver", "https://reqres.in/img/faces/2-image.jpg");
		User mockuser3 =new User(3, "emma.wong@reqres.in", "Emma", "Wong", "https://reqres.in/img/faces/3-image.jpg");
		User mockuser4 =new User(4, "Eve.Holt@reqres.in", "Eve", "Holt", "https://reqres.in/img/faces/4-image.jpg");
		User mockuser5 =new User(5, "Charles.Morris@reqres.in", "Charles", "Morris", "https://reqres.in/img/faces/5-image.jpg");
		User mockuser6 =new User(6, "Tracey.Ramos@reqres.in", "Tracey", "Ramos", "https://reqres.in/img/faces/6-image.jpg");
		lista_data_entera.add(mockuser1);
		lista_data_entera.add(mockuser2);
		lista_data_entera.add(mockuser3);
		lista_data_entera.add(mockuser4);
		lista_data_entera.add(mockuser5);
		lista_data_entera.add(mockuser6);
		for (User cada_usuario:lista_data_entera) {
			Data_reestructurada mockdatarest=new Data_reestructurada(cada_usuario.getId(),cada_usuario.getLast_name(),cada_usuario.getEmail());
			mockListaEstructurada.add(mockdatarest);
		} 

		Mockito.when(paypage.extraer_datos()).thenReturn(mockListaEstructurada);
		
	}
	
	
	@Test
	void extraerpaypage() {
		
		
		Data_salida data_salida;
		data_salida=user_controller.pasar(paypage);
		System.out.print(data_salida);
		JSONObject jsonprueba=new JSONObject();
		try {
			jsonprueba = new JSONObject("{\r\n" + 
					"    \"fechaActual\": \"2022/05/2211:53:27-0500\",\r\n" + 
					"    \"data_reest\": [\r\n" + 
					"        {\r\n" + 
					"            \"id\": 1,\r\n" + 
					"            \"last_name\": \"Bluth\",\r\n" + 
					"            \"email\": \"george.bluth@reqres.in\"\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"            \"id\": 2,\r\n" + 
					"            \"last_name\": \"Weaver\",\r\n" + 
					"            \"email\": \"janet.weaver@reqres.in\"\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"            \"id\": 3,\r\n" + 
					"            \"last_name\": \"Wong\",\r\n" + 
					"            \"email\": \"emma.wong@reqres.in\"\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"            \"id\": 4,\r\n" + 
					"            \"last_name\": \"Holt\",\r\n" + 
					"            \"email\": \"eve.holt@reqres.in\"\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"            \"id\": 5,\r\n" + 
					"            \"last_name\": \"Morris\",\r\n" + 
					"            \"email\": \"charles.morris@reqres.in\"\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"            \"id\": 888888,\r\n" + 
					"            \"last_name\": \"Ramos\",\r\n" + 
					"            \"email\": \"tracey.ramos@reqres.in\"\r\n" + 
					"        }\r\n" + 
					"    ]\r\n" + 
					"}");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertEquals( jsonprueba , data_salida);
		
		
	} 	
}
