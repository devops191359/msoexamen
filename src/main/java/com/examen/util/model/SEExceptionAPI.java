package com.examen.util.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SEExceptionAPI  extends RuntimeException{


	private HttpStatus status;

	private String codigo;

	private String mensaje;

	private String folio;

	private List<?> detalles;



	public SEExceptionAPI (HttpStatus status, String codigo, String mensaje, String folio, List<?> detalles) {
		this.status=status;
		this.codigo=codigo;
	    this.mensaje=mensaje;
	    this.folio=folio;
	    this.detalles=detalles;
	}



}
