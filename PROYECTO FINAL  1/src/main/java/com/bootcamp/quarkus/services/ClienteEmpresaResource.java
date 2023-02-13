package com.bootcamp.quarkus;
import com.nttdata.domain.ClienteEmpresa;
import com.nttdata.dao.ClienteEmpresaDAO;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/empresa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ClienteEmpresaResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ClienteEmpresa> getAll(){
          return  ClienteEmpresa.findAll().list();
    }

     @GET
	 @Path("{id}")
	 public ClienteEmpresa BuscarCliente(@PathParam Long id) {
	        ClienteEmpresa entity = ClienteEmpresaDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Empresa no tiene id : " + id + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(ClienteEmpresa clienteEmpresa) {
	        if (clienteEmpresa.getId() != null) {
	            throw new WebApplicationException("Id no fue creado", 422);
	        }
	        ClienteEmpresaDAO.persist(clienteEmpresa);
	        return Response.ok(clienteEmpresa).status(201).build();
	                                                         }
	 @PUT
	 @Path("{ruc}")
	 @Transactional
	 public ClienteEmpresa update(@PathParam Long ruc, ClienteEmpresa clienteEmpresa) {
	        if (clienteEmpresa.getRuc() == null) {
	            throw new WebApplicationException("No se encontro ruc empresa", 422);
	        }
	        ClienteEmpresa entity = ClienteEmpresaDAO.findById(ruc);
	        if (entity == null) {
	            throw new WebApplicationException("Empresa no figura con este ruc " + ruc + " does not exist.", 404);
	        }
	        entity.setRuc(clienteEmpresa.getRuc());
	        return entity;
	    }
	 @DELETE
	 @Path("{ruc}")
	 @Transactional
	 public Response delete(@PathParam Long ruc) {
	        ClienteEmpresa entity = ClienteEmpresaDAO.findById(ruc);
	        if (entity == null) {
	            throw new WebApplicationException("Empresa con este ruc " + ruc + " no existe.", 404);
	        }
	        ClienteEmpresaDAO.delete(entity);
	        return Response.status(204).build();
                                               }











}
