package com.bootcamp.quarkus;
import java.time.Instant;
import java.util.List;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.domain.Operaciones;
import com.nttdata.dao.OperacionesDAO;
@ApplicationScoped
@RequiredArgsConstructor
@Path("/operacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class OperacionResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operaciones> getAll(){
          return  Operaciones.findAll().list();
    }



     @GET
	 @Path("{dsNombre}")
	 public Operaciones BuscarOperaciones(@PathParam String dsNombre) {
	        Operaciones entity = OperacionesDAO.findBydsNombre(dsNombre);
	        if (entity == null) {
	            throw new WebApplicationException("Esa es la operacion que  : " + dsNombre + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
     @Transactional
	     public Response GuardarOperacion(Operaciones operaciones, @Context UriInfo uriInfo) {
	         Operaciones.persist(operaciones);
	         UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(operaciones.id));
	         return Response.created(builder.build()).build();
              }

     @PUT
	     @Path("{idOperacion}")
	     @Transactional
	     public Operaciones update(@PathParam Long idOperacion, Operaciones) {
	         if (Operaciones.getModel() == null) {
	             throw new WebApplicationException("No se encontro la operacion", 422);
	         }
	         Operaciones entity = OperacionesDAO.findById(idOperacion);
	         if (entity == null) {
	             throw new WebApplicationException("No hay operacion " + id + " dno existe", 404);
	         }

	         private Instant fcOperacion = Instant.now();
	         entity.setFcOperacion(fcOperacion);
	         return entity;
                                                 }




	 @DELETE
	 @Path("{idOperacion}")
	 @Transactional
	 public Response delete(@PathParam Long idOperacion) {
	        Operaciones entity = Operaciones.findById(idOperacion);
	        if (entity == null) {
	            throw new WebApplicationException("No hay numero de operacion " + idOperacion + " no existe.", 404);
	        }
	        OperacionesDAO.delete(entity);
	        return Response.status(204).build();
                                               }







}
