package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Cliente;

public interface IClienteService {

	Cliente registrar(Cliente cliente) throws Exception;


	Cliente modificar(Cliente cliente) throws Exception;

	List<Cliente> listarCliente() throws Exception;


	Cliente buscarPorId(Integer id) throws Exception;



}
