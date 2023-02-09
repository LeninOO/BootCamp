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
public class PagoCreditoServiceImpl implements IPagoCreditoService{


	@Inject
	private PagoCreditoDAO dao;
	/**
	 *
	 */
	@Override
	@Transactional
	public Operaciones registrar(Operaciones pagocredito) throws Exception {

		if(Objects.nonNull(pagocredito)) {

			LocalDateTime fcActual = LocalDateTime.now();

			pagocredito.setFcAltaFila(fcActual);
			this.dao.persist(pagocredito);

		}

		return pagocredito;
	}
	/**
	 *
	 */
	@Override
	public Operaciones modificar(Operaciones pagocredito) throws Exception {

		if(Objects.nonNull(pagocredito)) {

			LocalDateTime fcActual = LocalDateTime.now();

			cuenta.setFcModifFila(fcActual);
			this.dao.persist(pagocredito);

		}

		return pagocredito;
	}
	/**
	 *
	 */
	@Override
	public List<Operaciones> listarPagoCredito() throws Exception {

		return this.dao.findAll().list();
	}


	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		Operaciones pagocredito = new Operaciones();

		if(Objects.nonNull(id)) {
			LocalDateTime fcBaja =  LocalDateTime.now();
			pagocredito.setFcBajaFila(fcBaja);}

		this.dao.persist(pagocredito);



	}
	/**
	 *
	 */
	@Override
	public Operaciones buscarPorId(Long id) throws Exception {

		return this.dao.findById(id);
	}

}
