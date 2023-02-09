package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TipoCliente;

public interface ITipoClienteService {

	TipoCliente registrar(TipoCliente tipoCliente) throws Exception;


	TipoCliente modificar(TipoCliente tipoCliente) throws Exception;

	List<TipoCliente> listarTiposCliente() throws Exception;


	TipoCliente buscarPorId(Integer id) throws Exception;


	void eliminar(Integer id) throws Exception;
}
