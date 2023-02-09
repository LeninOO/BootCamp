package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Cuenta;

public interface ICuentaService {

        Cuenta registrar(Cuenta cuenta) throws Exception;


		Cuenta modificar(Cuenta cuenta) throws Exception;

		List<Cuenta> listarCuenta() throws Exception;


		Cuenta buscarPorId(Integer id) throws Exception;


	//void eliminar(Integer id) throws Exception;
}
