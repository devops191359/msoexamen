package com.examen.service;

import org.springframework.stereotype.Service;

import com.examen.dao.ClienteDAO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClienteServiceImpl implements ClienteService {

	private final ClienteDAO clienteDAO;

	public ClienteServiceImpl(final ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

}
