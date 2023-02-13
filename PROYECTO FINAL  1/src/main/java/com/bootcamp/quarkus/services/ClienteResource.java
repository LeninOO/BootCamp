package com.bootcamp.quarkus;
import java.util.List;
import com.nttdata.domain.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.dao.ClienteDAO;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ClienteResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.nttdata.domain.Cliente> getAll(){
          return  Cliente.findAll().list();
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
	 public Cliente BuscarCliente(@PathParam Long id) {
		 com.nttdata.dao.ClienteDAO ClienteDAO;
		 Cliente entity = ClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Cliente con id : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(Cliente cliente) {
	        if (cliente.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        ClienteDAO.persist(cliente);
	        return Response.ok(cliente).status(201).build();
	    }
	 @PUT
	 @Path("{id}")
	 @Transactional
	 public Cliente update(@PathParam Long id, Cliente cliente) {
	        if (Cliente.getDni() == null) {
	            throw new WebApplicationException("No se encontro dni de cliente.", 422);
	        }
	        Cliente entity = ClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Car with id of " + id + " does not exist.", 404);
	        }
	        entity.setDni(cliente.getDni());
	        return entity;
	    }
	 @DELETE
	 @Path("{id}")
	 @Transactional
	 public Response delete(@PathParam Long id) {
	        Cliente entity = ClienteDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Cliente con este id " + id + " no existe.", 404);
	        }
	        ClienteDAO.delete(entity);
	        return Response.status(204).build();
    }











}
