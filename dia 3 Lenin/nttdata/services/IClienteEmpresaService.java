package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.ClienteEmpresa;

public interface IClienteEmpresaService {

	ClienteEmpresa registrar(ClienteEmpresa empresa) throws Exception;


	ClienteEmpresa modificar(ClienteEmpresa empresa) throws Exception;

	List<ClienteEmpresa> listarEmpresa() throws Exception;


	ClienteEmpresa buscarPorId(Integer id) throws Exception;


	void eliminar(Integer id) throws Exception;
}
