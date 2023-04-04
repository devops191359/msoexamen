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
@Table(name = "TA_CLIENTE")
public class ClienteEntity implements Serializable {

	@Id
	@Column(name = "FIIDCLIENTE",unique = true)
	private Integer idCliente;
	
	@Column(name = "FINOMBRE", nullable = false, length = 50)
	private String nombreCliente;
	
	
	@Column(name = "FISTATUS" , nullable = false)
	private Integer estatus;
	
	
	
	
}
