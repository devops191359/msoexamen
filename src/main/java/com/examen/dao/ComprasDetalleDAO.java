package com.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.examen.entidad.CompraDetalleEntity;

public interface ComprasDetalleDAO extends CrudRepository<CompraDetalleEntity, Integer>, JpaRepository<CompraDetalleEntity, Integer> {

}
