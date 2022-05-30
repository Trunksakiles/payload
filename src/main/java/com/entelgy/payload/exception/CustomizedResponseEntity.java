package com.entelgy.payload.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.entelgy.payload.dto.DataEntradaFail;

@ControllerAdvice
@RestController
public class CustomizedResponseEntity extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DataEntradaFail.class)
	public final ResponseEntity<Object> HandleDataEntradaFail(Exception e, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), e.getMessage(),
				request.getDescription(false));

		return new ResponseEntity(exceptionResponse, HttpStatus.REQUEST_TIMEOUT);

	}
}
