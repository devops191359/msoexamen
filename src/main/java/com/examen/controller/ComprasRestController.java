package com.examen.controller;

import java.util.Arrays;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.common.Constantes;
import com.examen.common.Util;
import com.examen.dto.ComprasRequestDTO;
import com.examen.dto.ResponseModel;
import com.examen.service.ComprasService;
import com.examen.util.model.ResponseService;
import com.examen.util.model.SEExceptionAPI;

@RequestMapping("/procesos")
@RestController
public class ComprasRestController {

	private final Util util;
	private final ComprasService comprasService;

	public ComprasRestController(final ComprasService comprasService, final Util util) {

		this.util = util;
		this.comprasService = comprasService;
	}

	@PostMapping
	public Object setComprasCliente(@RequestBody ComprasRequestDTO req) throws Exception {

		try {
			boolean respuesta = this.comprasService.saveComprasCliente(req);
			return new ResponseService(HttpStatus.CREATED, util.getCodigo(), Constantes.OPERACION_201, util.getFolio(), respuesta);
		} catch (SEExceptionAPI e) {
			throw e;
		} catch (Exception exc) {
			SEExceptionAPI ex = new SEExceptionAPI(HttpStatus.INTERNAL_SERVER_ERROR, util.getCodigo(),
					Constantes.OPERACION_500, util.getFolio(), Arrays.asList(exc.getMessage()));
			throw ex;
		}
	}

}
