package com.examen.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="TA_PRODUCTO")
public class ProductoEntity  implements Serializable{
	
	@Id
	@Column(name = "FIIDPRODUCTO",unique = true)
	private Integer idProducto;
	
	@Column(name = "FCCLAVE" , nullable = false ,length = 15)
	private String clave;
	
	@Column(name="FCDESCRIPCION" ,nullable = false , length = 150)
	private String descripcion;
	
	@Column(name="FIESTATUS", nullable = false)
	private Integer estatus;
	

}
