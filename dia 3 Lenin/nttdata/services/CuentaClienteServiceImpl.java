package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.nttdata.dao.TransaccionDAO;
import com.nttdata.domain.Operaciones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CuentaClienteServiceImpl implements ICuentaClienteService{


	@Inject
	private CuentaClienteDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public CuentaCliente registrar(CuentaCliente cuentaCliente) throws Exception {

		if(Objects.nonNull(cuentaCliente)) {

			LocalDateTime fcActual = LocalDateTime.now();

			cuentaCliente.setFcAltaFila(fcActual);
			this.dao.persist(cuentaCliente);

		}

		return cuentaCliente;
	}
	/**
	 *
	 */
	@Override
	public CuentaCliente modificar(CuentaCliente cuentaCliente) throws Exception {

		if(Objects.nonNull(cuentaCliente)) {

			LocalDateTime fcActual = LocalDateTime.now();

			cuentaCliente.setFcModifFila(fcActual);
			this.dao.persist(cuentaCliente);

		}

		return cuentaCliente;
	}
	/**
	 *
	 */
	@Override
	public List<CuentaCliente> listarCuenta() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		CuentaCliente cuentaCliente = new cuentaCliente();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			cuentaCliente.setFcBajaFila(fcBaja);}

		this.dao.persist(cuentaCliente);



	}
	/**
	 *
	 */
	@Override
	public CuentaCliente buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
