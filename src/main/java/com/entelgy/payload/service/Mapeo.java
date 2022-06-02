package com.entelgy.payload.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.dto.User;
import org.springframework.beans.factory.annotation.Autowired;

public class Mapeo {
	@Autowired
	private Tiempo tiempo;
	@Autowired
	private Consumo consumo;

	public DataSalida reestructurar_datos() {
		try {
			Date fecha = Calendar.getInstance().getTime();
			String srtFecha = tiempo.obtenerFormatoFecha(fecha);

			DataEntrada data_entrada = consumo.consumir();

			List<User> lista_usuarios = data_entrada.getData();
			List<String> list_strDatos = new ArrayList<String>();

			for (User cada_usuario : lista_usuarios) {
				String strdata = new String(
						cada_usuario.getId() + "|" + cada_usuario.getLast_name() + "|" + cada_usuario.getEmail());
				list_strDatos.add(strdata);
			}
			DataSalida data_salida = new DataSalida(srtFecha, list_strDatos);
			return data_salida;
		} catch (NullPointerException e) {
			System.out.println(" Nulo capturado en mapeo");
		}
		return null;
	}

	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
}
