package com.examen.service;

import org.springframework.stereotype.Service;

import com.examen.dao.ProductoDAO;
import com.examen.entidad.ProductoEntity;

@Service
public class ProductoServiceImpl implements ProductoService {

	private final ProductoDAO productoDAO;

	public ProductoServiceImpl(final ProductoDAO productoDAO) {

		this.productoDAO = productoDAO;
	}

	@Override
	public boolean saveProducto(ProductoEntity producto) {
		// TODO Auto-generated method stub
		return false;
	}

}
