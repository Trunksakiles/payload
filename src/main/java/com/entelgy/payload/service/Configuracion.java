package com.entelgy.payload.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Configuracion {

	private ApplicationContext ctx;
	private Tiempo tiempo;
	private Consumo consumo;
	private Mapeo mapeo;
	private static Configuracion config=new Configuracion();
	
	private Configuracion() {
		if(config==null) {
			ctx = new ClassPathXmlApplicationContext("beans.xml");
			tiempo = ctx.getBean(Tiempo.class);
			consumo = ctx.getBean(Consumo.class);
			mapeo = ctx.getBean(Mapeo.class);
		}		
	}
	
	public static Configuracion getConfiguracion() {	
		return config;
	}
	
	public  Tiempo getTiempo() {
		return tiempo;
	}
	public  Mapeo getMapeo() {
		return mapeo;
	}
	public  Consumo getConsumo() {
		return consumo;
	}
	
/*
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	*/
	
}
