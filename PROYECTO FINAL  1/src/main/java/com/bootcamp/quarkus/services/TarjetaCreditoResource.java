package com.bootcamp.quarkus;
import java.util.List;
import com.nttdata.domain.TarjetaCredito;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.dao.TarjetaCreditoDAO;


@ApplicationScoped
@RequiredArgsConstructor
@Path("/TarjetaCredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TarjetaCreditoResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TarjetaCredito> getAll(){
          return  TarjetaCredito.findAll().list();
    }


     @GET
	 @Path("{id}")
	 public TarjetaCredito BuscarTarjeta(@PathParam Long id) {
	        TarjetaCredito entity = TarjetaCreditoDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta credito : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(TarjetaCredito tarjetaCredito) {
	        if (TarjetaCredito.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        TarjetaCreditoDAO.persist(tarjetaCredito);
	        return Response.ok(tarjetaCredito).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public TarjetaCredito update(@PathParam Long id, TarjetaCredito tarjetaCredito) {
	        if (TarjetaCreditoDAO.getId() == null) {
	            throw new WebApplicationException("No se encontro tarjeta credito.", 422);
	        }
	        TarjetaCredito entity = TarjetaCreditoDAO.getCdPin(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta de credito no existe " + id + " does not exist.", 404);
	        }
	        entity.setPin(TarjetaCredito.getCdPin());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        TarjetaCredito entity = TarjetaCredito.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Tarjeta no existe " + id + " no existe.", 404);
	        }
	        TarjetaCreditoDAO.delete(entity);
	        return Response.status(204).build();
    }











}
