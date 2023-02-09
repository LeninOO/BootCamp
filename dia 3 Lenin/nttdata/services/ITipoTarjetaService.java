package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.TipoTarjeta;

public interface ITipoTarjetaService {

	TipoTarjeta registrar(TipoTarjeta tipotarjeta) throws Exception;


	TipoTarjeta modificar(TipoTarjeta tipotarjeta) throws Exception;

	List<TipoTarjeta> listarTipoTarjeta() throws Exception;


	TipoTarjeta buscarPorId(Integer id) throws Exception;


	void eliminar(Integer id) throws Exception;
}
