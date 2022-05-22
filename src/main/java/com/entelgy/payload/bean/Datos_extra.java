package com.entelgy.payload.bean;

public class Datos_extra {
private String url;
private String text;
public Datos_extra(String url, String text) {
	super();
	this.url = url;
	this.text = text;
}
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
