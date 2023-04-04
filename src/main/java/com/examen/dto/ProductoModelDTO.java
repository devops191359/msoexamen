package com.examen.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductoModelDTO implements Serializable{
	
	private Integer idProducto;
	private Integer cantidad;
}
