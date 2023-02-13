package com.bootcamp.quarkus;
import java.util.List;
import com.nttdata.domain.PagoCredito;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.dao.PagoCreditoDAO;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/pagocredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class PagoCreditoResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.nttdata.domain.PagoCredito> getAll(){
          return  PagoCredito.findAll().list();
    }



     @GET
	 @Path("{idPagoCredito}")
	 public PagoCredito BuscarCredito(@PathParam String idPagoCredito) {
	        PagoCredito entity = PagoCreditoDAO.findBydsNombre(idPagoCredito);
	        if (entity == null) {
	            throw new WebApplicationException("Esa es la operacion que  : " + idPagoCredito + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
     @Transactional
	 public Response GuardarOperacion(PagoCredito pagoCredito, @Context UriInfo uriInfo) {
	         PagoCredito.persist(pagoCredito);
	         UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(pagoCredito.id));
	         return Response.created(builder.build()).build();
              }




     @PUT
	     @Path("{idPagoCredito}")
	     @Transactional
	     public PagoCredito update(@PathParam Long idPagoCredito,PagoCredito pagoCredito) {
	         if (PagoCredito.getModel() == null) {
	             throw new WebApplicationException("No se encontro la operacion", 422);
	         }
	         PagoCredito entity = PagoCreditoDAO.findById(idPagoCredito);
	         if (entity == null) {
	             throw new WebApplicationException("No hay operacion " + id + " dno existe", 404);
	         }

	         private Instant fcOperacion = Instant.now();
	         entity.setFcOperacion(fcOperacion);
	         return entity;
                                                 }




	 @DELETE
	 @Path("{idPagoCredito}")
	 @Transactional
	 public Response delete(@PathParam Long idPagoCredito) {
	         entity = PagoCreditoDAO.findById(idPagoCredito);
	        if (entity == null) {
	            throw new WebApplicationException("No hay numero de operacion " + idPagoCredito + " no existe.", 404);
	        }
	        PagoCreditoDAO.delete(entity);
	        return Response.status(204).build();
                                               }







}
