package com.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.examen.entidad.ClienteEntity;

public interface ClienteDAO extends CrudRepository<ClienteEntity, Integer>, JpaRepository<ClienteEntity, Integer>{

}
