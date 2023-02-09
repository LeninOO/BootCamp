package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.PagoCredito;

public interface IPagoCredito {

        PagoCredito registrar(Cuenta cuenta) throws Exception;


		PagoCredito modificar(Cuenta cuenta) throws Exception;

		List<PagoCredito> listarPagoCredito() throws Exception;

		PagoCredito buscarPorId(Integer id) throws Exception;


	//void eliminar(Integer id) throws Exception;
}
