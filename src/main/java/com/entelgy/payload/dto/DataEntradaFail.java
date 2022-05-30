package com.entelgy.payload.dto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataEntradaFail extends RestClientException {
	public DataEntradaFail(String msg) {
		super(msg);
	}

}
