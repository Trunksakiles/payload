package com.entelgy.payload.dto;

import java.io.Serializable;

public class DatosExtra implements Serializable {

	private String url;
	private String text;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
