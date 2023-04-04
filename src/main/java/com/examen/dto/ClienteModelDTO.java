package com.examen.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data
public class ClienteModelDTO implements Serializable {

	private Integer idCliente;

	private List<ProductoModelDTO> listaSemanal;

	private List<ProductoModelDTO> listaAnual;

	private List<ProductoModelDTO> mensual;

}
