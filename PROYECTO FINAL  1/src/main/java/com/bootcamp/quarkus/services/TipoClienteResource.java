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

public class TipoClienteResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TipoCliente> getAll(){
          return  TipoCliente.findAll().list();
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
	 public TipoCliente buscar(@PathParam Long id) {
	        TipoCliente entity = TipoClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("TipoCliente con id : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(TipoCliente tipoCliente) {
	        if (tipoCliente.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        TipoClienteDAO.persist(tipoCliente);
	        return Response.ok(tipoCliente).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public TipoCliente update(@PathParam Long id, TipoCliente tipoCliente) {
	        if (tipoCliente.geEmpresa() == null) {
	            throw new WebApplicationException("No se encontro ninguna empresa asociada.", 422);
	        }
	        TipoCliente entity = TipoClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("No hay ninguna empresa asociada a ese id" + id + " does not exist.", 404);
	        }
	        entity.setEmpresa(tipoCliente.getEmpresa());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        TipoCliente entity = TipoClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("TipoCliente con este id " + id + " no existe.", 404);
	        }
	        TipoClientDAO.delete(entity);
	        return Response.status(204).build();
    }











}
