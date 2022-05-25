package com.entelgy.payload.service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.dto.User;

@Service("mapeo")
public class Mapeo {
	
	@Autowired
	Tiempo tiempo;

	@Autowired
	Consumo consumo;

	public DataSalida reestructurar_datos() throws URISyntaxException {

		String srtFecha =new String(tiempo.obtenerFecha());
		 
		DataEntrada data_entrada=new DataEntrada();
		data_entrada = consumo.consumir();

		List<User> lista_usuarios = data_entrada.getData();
		List<String> list_strDatos = new ArrayList<String>();

		for (User cada_usuario : lista_usuarios) {
			String strdata = new String(
					cada_usuario.getId() + "|" + cada_usuario.getLast_name() + "|" + cada_usuario.getEmail());
			list_strDatos.add(strdata);
		}
		DataSalida data_salida = new DataSalida(srtFecha, list_strDatos);
		return data_salida;
	}
	

}
