package com.examen.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseModel implements Serializable {

	private String codigo;
	private String mensaje;
	private String folio;
	private Object resultado;
	
}
