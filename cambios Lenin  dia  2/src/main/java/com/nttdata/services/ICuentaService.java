package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Cuenta;

public interface ICuentaService {

    void cambiarclave(Cuenta cuenta) throws Exception;

	Float  saldocuenta(Cuenta cuenta) throws Exception;

	List<Operaciones> Movimientos(Cuenta  cuenta) throws Exception;


	Cuenta buscarcuenta(Integer id) throws Exception;


	//void eliminar(Integer id) throws Exception;
}
