package com.examen.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dao.ClienteDAO;
import com.examen.dao.ComprasClienteDAO;
import com.examen.dao.ComprasDetalleDAO;
import com.examen.dao.ProductoDAO;
import com.examen.dto.ComprasRequestDTO;
import com.examen.entidad.ClienteEntity;
import com.examen.entidad.ComprasClienteEntity;
import com.examen.entidad.ProductoEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ComprasServiceImpl implements ComprasService {

	@Autowired
	private ComprasDetalleDAO comprasDetalleDAO;

	@Autowired
	private ComprasClienteDAO comprasClienteDAO;

	@Autowired
	private ProductoDAO productoDAO;

	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public boolean saveComprasCliente(ComprasRequestDTO req) throws Exception {
		// TODO Auto-generated method stub

		List<ComprasClienteEntity> comprasCliente2 = new ArrayList<>();
		
			final List<ComprasClienteEntity> comprasCliente = new ArrayList<>();

			boolean respuestaOk = false;

			req.getClientes().forEach(cliente -> {

				ClienteEntity c = this.clienteDAO.findById(cliente.getIdCliente()).orElse(null);

				if (c != null) {

					cliente.getListaAnual().forEach(prod -> {

						ProductoEntity p = this.productoDAO.findById(prod.getIdProducto()).orElse(null);

						ComprasClienteEntity comprasClienteEntity = new ComprasClienteEntity();
						comprasClienteEntity.setEstatus(1);
						comprasClienteEntity.setIdCliente(c.getIdCliente());
						comprasClienteEntity.setFechaAlta(new Date());
						comprasClienteEntity.setNombre(p.getDescripcion());
						comprasCliente.add(comprasClienteEntity);

					});
					cliente.getListaSemanal().forEach(prod -> {
						ProductoEntity p = this.productoDAO.findById(prod.getIdProducto()).orElse(null);
						ComprasClienteEntity comprasClienteEntity = new ComprasClienteEntity();

						comprasClienteEntity.setEstatus(1);
						comprasClienteEntity.setIdCliente(c.getIdCliente());
						comprasClienteEntity.setFechaAlta(new Date());
						comprasClienteEntity.setNombre(p.getDescripcion());

						comprasCliente.add(comprasClienteEntity);

					});

					cliente.getMensual().forEach(prod -> {

						ProductoEntity p = this.productoDAO.findById(prod.getIdProducto()).orElse(null);
						ComprasClienteEntity comprasClienteEntity = new ComprasClienteEntity();
						comprasClienteEntity.setEstatus(1);
						comprasClienteEntity.setIdCliente(c.getIdCliente());
						comprasClienteEntity.setFechaAlta(new Date());
						comprasClienteEntity.setFechaModificacion(new Date());
						comprasClienteEntity.setNombre(p.getDescripcion());
						comprasCliente.add(comprasClienteEntity);
					});
				}
			});

			comprasCliente2 = comprasCliente.stream().distinct().toList();

			Iterable<ComprasClienteEntity> iterable = comprasCliente2;

			comprasCliente2 = this.comprasClienteDAO.saveAll(iterable);

			if (!comprasCliente.isEmpty()) {
				return true;
			}
		return false;

	}

}
