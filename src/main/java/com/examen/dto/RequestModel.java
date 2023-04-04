package com.examen.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestModel implements Serializable{
	
	private Integer id;
	private String nombre;
	private Integer edad;

}
