package com.examen.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TA_COMPRACLIENTE")
public class ComprasClienteEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FIIDCOMPRAC", unique = true, nullable = false)
	private Integer idCompraCliente;

	@Column(name = "FIIDCLIENTE", nullable = false)
	private Integer idCliente;

	// @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL,
	// mappedBy="idCliente")
	// private List<ClienteEntity> clientes;

	@Column(name = "FCNOMBRE", nullable = false, length = 50)
	private String nombre;

	@Column(name = "FDFECHAALTA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;

	@Column(name = "FDFECHAMODIFICA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	@Column(name = "FISTATUS", nullable = false)
	private Integer estatus;

}
