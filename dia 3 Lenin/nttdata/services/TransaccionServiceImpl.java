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
public class TransaccionServiceImpl implements ITransaccionService{


	@Inject
	private TransaccionDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public Operaciones registrar(Operaciones transaccion) throws Exception {

		if(Objects.nonNull(transaccion)) {

			LocalDateTime fcActual = LocalDateTime.now();

			transaccion.setFcAltaFila(fcActual);
			this.dao.persist(transaccion);

		}

		return transaccion;
	}
	/**
	 *
	 */
	@Override
	public Operaciones modificar(Operaciones transaccion) throws Exception {

		if(Objects.nonNull(transaccion)) {

			LocalDateTime fcActual = LocalDateTime.now();

			transaccion.setFcModifFila(fcActual);
			this.dao.persist(transaccion);

		}

		return transaccion;
	}
	/**
	 *
	 */
	@Override
	public List<Operaciones> listarTransaccion() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		Operaciones transaccion = new Operaciones();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			transaccion.setFcBajaFila(fcBaja);}

		this.dao.persist(transaccion);



	}
	/**
	 *
	 */
	@Override
	public Operaciones buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
