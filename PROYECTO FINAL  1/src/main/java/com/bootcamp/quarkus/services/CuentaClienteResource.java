package com.bootcamp.quarkus;
import java.util.List;
import com.nttdata.domain.CuentaCliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.dao.CuentaClienteDAO;
@ApplicationScoped
@RequiredArgsConstructor
@Path("/cuentaCliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CuentaClienteResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CuentaCliente> getAll(){
          return  CuentaCliente.findAll().list();
    }




     @GET
	 @Path("{id}")
	 public CuentaCliente Buscar(@PathParam Long id) {
	        CuentaCliente entity = CuentaClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Cliente con id : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(CuentaCliente cuentaCliente) {
	        if (cuentaCliente.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        CuentaClienteDAO.persist(cuentaCliente);
	        return Response.ok(cuentaCliente).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public CuentaCliente update(@PathParam Long id, CuentaCliente cuentaCliente) {
	        if (CuentaCliente.getFcTransaccion() == null) {
	            throw new WebApplicationException("No se encontro dni de cliente.", 422);
	        }
	        CuentaCliente entity = CuentaClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Car with id of " + id + " does not exist.", 404);
	        }
	        entity.setFcTransaccion(cuentaCliente.getFcTranscaccion());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        CuentaCliente entity = CuentaClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Cliente con este id " + id + " no existe.", 404);
	        }
	        CuentaClienteDAO.delete(entity);
	        return Response.status(204).build();
    }











}
