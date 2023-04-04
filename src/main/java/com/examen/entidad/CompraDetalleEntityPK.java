package com.examen.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CompraDetalleEntityPK  implements 	Serializable{
	@Id
	@Column(name = "FIIDCOMPRADET", unique = true)
	private Integer idCompraDetalle;

	@Id
	@Column(name = "FCCODIGOSKU", unique = true)
	private String codigoSku;
}
