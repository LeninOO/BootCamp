package com.nttdata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.nttdata.dao.TransaccionDAO;
import com.nttdata.domain.Cuenta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CuentaServiceImpl implements ICuentaService{


	@Inject
	private CuentaDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	/**
	 *  Registra  una  nueva  cuenta
	 */
	public Cuenta registrar(Cuenta cuenta) throws Exception {

		if(Objects.nonNull(cuenta)) {

			LocalDateTime fcActual = LocalDateTime.now();

			cuenta.setFcAltaFila(fcActual);
			this.dao.persist(cuenta);

		}

		return cuenta;
	}
	/**
	 *
	 */
	@Override
	/**
	 actualizacion del ultimo movimiento de la cuenta
	 */
	public Cuenta modificar(Cuenta cuenta) throws Exception {

		if(Objects.nonNull(cuenta)) {

			LocalDateTime fcActual = LocalDateTime.now();

			cuenta.setFcModifFila(fcActual);
			this.dao.persist(cuenta);

		}

		return cuenta;
	}
	/**
	 * Obtener el listado de las cuentas que se maneja
	 */
	@Override
	public List<Cuenta> listarCuenta() throws Exception {

		return this.dao.findAll().list();
	}
  

	/**
	 *  Eliminar o cancelar una cuenta, este método no serainvocado por la interfaz
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		Cuenta cuenta = new cuenta();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			cuenta.setFcBajaFila(fcBaja);}

		this.dao.persist(cuenta);



	}
	/**
	 *    Busca de acuerdo al indice la cuenta correspondiente
	 */
	@Override
	public Cuenta buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
