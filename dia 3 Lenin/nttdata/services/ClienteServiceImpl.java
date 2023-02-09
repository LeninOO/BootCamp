package com.nttdata.services;

import java.util.List;

import com.nttdata.dao.TipoTarjetaDAO;
import com.nttdata.domain.TipoTarjeta;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TipoTarjetaServiceImpl implements ITipoTarjetaService{


	@Inject
	private TipoTarjetaDAO dao;

	@Override
	public TipoTarjeta registrar(TipoTarjeta tipotarjeta) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoTarjeta modificar(TipoTarjeta tipotarjeta) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoTarjeta> listarTipoTarjeta() throws Exception {

		return this.dao.findAll().list();
	}

	@Override
	public TipoTarjeta buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}

	//	@Override
	//	public void eliminar(Integer id) throws Exception {
	//
	//
	//	Cliente cliente = new Cliente();
	//	if(Objects.nonNull(id)) {
	//
	//	LocalDateTime fcBaja =  LocalDateTime.now();
	//	cliente.set;
	//	}
	//	dao.persist(cliente);
	//
	//	}

}
