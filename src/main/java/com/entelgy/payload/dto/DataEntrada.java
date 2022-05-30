package com.entelgy.payload.dto;

import java.io.Serializable;
import java.util.List;

public class DataEntrada implements Serializable {

	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages; // datos de arriba
	private List<User> data; // datos de usuarios
	private DatosExtra support;// datos inferiores

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

	public DatosExtra getSupport() {
		return support;
	}

	public void setSupport(DatosExtra support) {
		this.support = support;
	}

}
