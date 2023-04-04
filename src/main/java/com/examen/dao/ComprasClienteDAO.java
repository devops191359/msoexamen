package com.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.examen.entidad.ComprasClienteEntity;

public interface ComprasClienteDAO
		extends CrudRepository<ComprasClienteEntity, Integer>, JpaRepository<ComprasClienteEntity, Integer> {

}
