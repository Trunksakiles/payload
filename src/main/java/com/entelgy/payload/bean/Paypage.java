package com.entelgy.payload.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paypage {

	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages; // datos de arriba
	private List<User> data;	// datos de usuarios
	private Datos_extra support;// datos inferiores
	public Paypage(Integer page, Integer per_page, Integer total, Integer total_pages, List<User> data,
			Datos_extra support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPer_page() {
		return per_page;
	}
	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}
	public List<User> getData() {
		return data;
	}
	public void setData(List<User> data) {
		this.data = data;
	}
	public Datos_extra getSupport() {
		return support;
	}
	public void setSupport(Datos_extra support) {
		this.support = support;
	}
	
	
	public List<Data_reestructurada> extraer_datos() {
		
	List<User> List_usuarios=this.data;
	List<Data_reestructurada> list_data_estruc=new ArrayList<Data_reestructurada>();
	for (User cada_usuario:List_usuarios) {
		Data_reestructurada data_r=new Data_reestructurada(cada_usuario.getId(),cada_usuario.getLast_name(),cada_usuario.getEmail());
		list_data_estruc.add(data_r);
	} 
	
		return list_data_estruc;
	}
	
}
