package com.bootcamp.quarkus;
import java.util.List;
//import com.bootcamp.quarkus.model.Pelicula;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/TipoCliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TipoTarjetaResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TipoTarjeta> getAll(){
          return  TipoTarjeta.findAll().list();
    }

    /*
    @POST
    @Transactional
    public Response persistArtist(com.bootcamp.quarkus.Pelicula pelicula, @Context UriInfo uriInfo) {
        com.bootcamp.quarkus.Pelicula.persist(pelicula);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(pelicula.id));
        return Response.created(builder.build()).build();
    }
    */


     @GET
	 @Path("{id}")
	 public TipoTarjeta buscar(@PathParam Long id) {
	        TipoTarjeta entity = TipoTarjetaDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("TipoTarjeta con id : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(TipoTarjeta tipoTarjeta) {
	        if (tipoTarjeta.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        TipoTarjetaDAO.persist(tipoTarjeta);
	        return Response.ok(tipoCliente).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public TipoTarjeta update(@PathParam Long id, TipoTarjeta tipoTarjeta) {
	        if (tipoTarjeta.geEmpresa() == null) {
	            throw new WebApplicationException("No se encontro ninguna tarjeta asociada.", 422);
	        }
	        TipoTarjeta entity = TipoTarjetaDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("No hay ninguna tarjeta asociada a ese id" + id + " does not exist.", 404);
	        }
	        entity.setEmpresa(tipoTarjeta.getEmpresa());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        TipoTarjeta entity = TipoTarjetaDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("TipoTarjeta no existe con este id " + id + " no existe.", 404);
	        }
	        TipoTarjetaDAO.delete(entity);
	        return Response.status(204).build();
    }











}
