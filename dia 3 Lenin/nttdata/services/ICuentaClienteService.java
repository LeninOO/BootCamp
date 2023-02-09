package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Cuenta;

public interface ICuentaClienteService {

        CuentaCliente registrar(CuentaCliente cuentaCliente) throws Exception;


		CuentaCliente modificar(CuentaCliente cuentaCliente) throws Exception;

		List<CuentaCliente> listarCuenta() throws Exception;


		CuentaCliente buscarPorId(Integer id) throws Exception;


	//void eliminar(Integer id) throws Exception;
}
