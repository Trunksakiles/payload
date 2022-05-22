package com.entelgy.payload.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data_salida {
	private String fechaActual;
	private List<Data_reestructurada> data_reest;

	public Data_salida(String fechaActual, List<Data_reestructurada> data_reest) {
		super();
		this.fechaActual = fechaActual;
		this.data_reest = data_reest;
	}

	public String getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(String fechaActual) {
		this.fechaActual = fechaActual;
	}

	public List<Data_reestructurada> getData_reest() {
		return data_reest;
	}

	public void setData_reest(List<Data_reestructurada> data_reest) {
		this.data_reest = data_reest;
	}
	
	

}
