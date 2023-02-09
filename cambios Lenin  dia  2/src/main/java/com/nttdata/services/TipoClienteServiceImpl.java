package com.nttdata.services;

import java.util.List;
import java.util.Objects;

import javax.naming.directory.InvalidAttributesException;

import com.nttdata.dao.TipoClienteDAO;
import com.nttdata.domain.TipoCliente;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TipoClienteServiceImpl implements ITipoClienteService{


	@Inject
	private TipoClienteDAO dao;


	@Override
	public TipoCliente registrar(TipoCliente tipoCliente) throws Exception {
		if (tipoCliente.getIdTipoCliente() != null) {
			throw new InvalidAttributesException("Error");
		}
		return null;
		//	return this.dao.persist(tipoCliente);
	}
	/**
	 *
	 */
	@Override
	public TipoCliente modificar(TipoCliente tipoCliente) throws Exception {

		TipoCliente tpcliente = new  TipoCliente();
		if(Objects.nonNull(tipoCliente.getIdTipoCliente() )|| Objects.nonNull(tipoCliente.getEmpresa())){

			tpcliente.setCliente(tipoCliente.getCliente());
			tpcliente.setEmpresa(tipoCliente.getEmpresa());

			this.dao.persist(tpcliente);
		}


		return tpcliente;
	}
	/**
	 *
	 */
	@Override
	public List<TipoCliente> listarTiposCliente() throws Exception {

		return this.dao.findAll().list();
	}
	/**
	 *
	 */
	@Override
	public TipoCliente buscarPorId(Integer id) throws Exception {

		return this.dao.findById(Long.valueOf(id));
	}
	/**
	 *
	 */
	@Override
	public void eliminar(Integer id) throws Exception {

		this.dao.deleteById(Long.valueOf(id));

	}

}
