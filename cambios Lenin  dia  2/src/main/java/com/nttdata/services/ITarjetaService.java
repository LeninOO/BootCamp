package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Tarjeta;

public interface ITarjetaService {

	Tarjeta  asociarcuenta(Cuenta cuenta) throws Exception;

	List<Operaciones> listarOperaciones(Tarjeta tarjeta) throws Exception;

	Float  pedirsaldo(Tarjeta  tarjeta) throws Exception;


	//void eliminar(Integer id) throws Exception;
}
