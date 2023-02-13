package com.bootcamp.quarkus;
import java.util.List;
//import com.bootcamp.quarkus.model.Pelicula;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.domain.TarjetaDebito;
import com.nttdata.dao.TarjetaDebitoDAO;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/TarjetaDebito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TarjetaDebitoResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.nttdata.domain.TarjetaDebito> getAll(){
          return  TarjetaDebito.findAll().list();
    }




     @GET
	 @Path("{id}")
	 public TarjetaDebito BuscarTarjeta(@PathParam Long id) {
	        TarjetaDebito entity = TarjetaDebitoDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta debito : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(TarjetaDebito tarjetaDebito) {
	        if (TarjetaDebito.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        TarjetaDebitoDAO.persist(tarjetaDebito);
	        return Response.ok(tarjetaDebito).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public TarjetaDebito update(@PathParam Long id, TarjetaDebito tarjetaDebito) {
	        if (TarjetaDebitoDAO.getId() == null) {
	            throw new WebApplicationException("No se encontro tarjeta debito.", 422);
	        }
	        TarjetaDebito  entity = TarjetaDebitoDAO.getCdPin(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta de debito no existe " + id + " does not exist.", 404);
	        }
	        entity.setPin(TarjetaDebito.getCdPin());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        TarjetaDebito entity = TarjetaDebito.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta no existe " + id + " no existe.", 404);
	        }
	        TarjetaDebitoDAO.delete(entity);
	        return Response.status(204).build();
    }











}
