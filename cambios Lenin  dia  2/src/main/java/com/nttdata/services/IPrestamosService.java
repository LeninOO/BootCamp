package com.nttdata.services;

import java.util.List;

import com.nttdata.domain.Prestamos;

public interface IPrestamosService {

	float pedirsaldo(Prestamos prestamos) throws Exception;
    String  datostitular(Prestamo prestamo)throws Exception;
    List<Cuotas> listarcuotas() throws Exception;
    List<fechapagomensual >  cronograma(Prestamos prestamos)throws Exception;




	//void eliminar(Integer id) throws Exception;
}
