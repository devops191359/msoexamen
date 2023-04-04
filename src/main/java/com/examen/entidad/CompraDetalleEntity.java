package com.examen.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TA_COMPRADET")
public class CompraDetalleEntity implements Serializable {

	@EmbeddedId
	private CompraDetalleEntityPK id;

	// @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL,
	// mappedBy="idCompraCliente")
	// private List<ComprasClienteEntity> comprasCliente;
	@Column(name = "FIIDCOMPRAC", nullable = false)
	private Integer idCliente;

	@Column(name = "FIIDPRODUCTO", nullable = false)
	private Integer idProducto;

	// @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL,
	// mappedBy="idProducto")
	// private List<ProductoEntity> productos;

	@Column(name = "FICCANTIDAD", nullable = false)
	private Integer cantidad;

}
