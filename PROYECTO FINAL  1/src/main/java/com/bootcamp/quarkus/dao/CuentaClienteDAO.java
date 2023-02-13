package com.nttdata.dao;

import com.nttdata.domain.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped

public class CuentaClienteDAO implements PanacheRepository<CuentaCliente> {

public CuentaCliente findById(String brand){
        return find("idCliente", dni).firstResult();
    }

}



