package com.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.examen.entidad.ProductoEntity;

public interface ProductoDAO extends CrudRepository<ProductoEntity, Integer>, JpaRepository<ProductoEntity, Integer> {

}
