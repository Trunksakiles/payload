package com.entelgy.payload.dto;

import java.io.Serializable;
import java.util.List;

public class DataSalida implements Serializable {
	private String operationDate;
	private List<String> data;

	public DataSalida(String operationDate, List<String> data) {
		super();
		this.operationDate = operationDate;
		this.data = data;
	}

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

}
