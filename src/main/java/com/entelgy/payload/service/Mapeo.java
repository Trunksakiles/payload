package com.entelgy.payload.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.entelgy.payload.dto.DataEntrada;
import com.entelgy.payload.dto.DataSalida;
import com.entelgy.payload.dto.User;

public class Mapeo {
	@Autowired
	private Tiempo tiempo;
	@Autowired
	private Consumo consumo;
	DataSalida data_salida;
	Date fecha = Calendar.getInstance().getTime();

	public DataSalida reestructurar_datos() throws NullPointerException{

		//try {

			String strFecha = tiempo.obtenerFormatoFecha(fecha);

			DataEntrada data_entrada= consumo.consumir(); 

			List<User> lista_usuarios = data_entrada.getData();
			List<String> list_strDatos = new ArrayList<String>();

			for (User cada_usuario : lista_usuarios) {
				String strdata = new String(
						cada_usuario.getId() + "|" + cada_usuario.getLast_name() + "|" + cada_usuario.getEmail());
				list_strDatos.add(strdata);
			}
			data_salida = new DataSalida(strFecha, list_strDatos);
			
		/*} catch (NullPointerException e) {
			System.out.println(" Nulo capturado en mapeo");
			data_salida= null;
		}*/
		return data_salida;	}

	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
