package com.nttdata.dao;

import com.nttdata.domain.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped

public class ClienteDAO implements PanacheRepository<Cliente> {

public Cliente findById(String brand){
        return find("idCliente", dni).firstResult();
    }

}



