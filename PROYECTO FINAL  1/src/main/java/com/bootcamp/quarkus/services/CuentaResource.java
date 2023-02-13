package com.bootcamp.quarkus;
import java.util.List;
import com.nttdata.domain.Cuenta;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import lombok.RequiredArgsConstructor;
import com.nttdata.dao.CuentaDAO;
import com.nttdata.domain.ClienteEmpresa;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/cuenta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CuentaResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cuenta> getAll(){
          return  Cuenta.findAll().list();
    }

     @GET
	 @Path("{nmcuenta}")
	 public Cuenta BuscarCuenta(@PathParam Long nmcuenta) {
	        Cuenta entity = CuentaDAO.findById(id);
	        if (entity == null) {
	            throw new WebApplicationException("Ese numero de cuenta  : " + nmcuenta + " no existe", 404);
	        }
	        return entity;
	                                           }
	 @POST
	 @Transactional
	 public Response Guardar(Cuenta cuenta) {
	        if (cuenta.getNmcuenta() != null) {
	            throw new WebApplicationException("cuenta no fue creada", 422);
	        }
	        CuentaDAO.persist(cuenta);
	        return Response.ok(cuenta).status(201).build();
	    }
	 @PUT
	 @Path("{nmcuenta}")
	 @Transactional
	 public Cuenta update(@PathParam Long Nmcuenta, Cuenta cuenta) {
	        if (cuenta.getNmcuenta() == null) {
	            throw new WebApplicationException("No se encontro numero de cuenta", 422);
	        }
	        Cuenta entity = CuentaDAO.findById(nmcuenta);
	        if (entity == null) {
	            throw new WebApplicationException("La cuenta consultada no figura " + nmcuenta + " no existe", 404);
	        }
	        entity.setNmcuenta(Cuenta.getNmcuenta());
	        return entity;
	    }
	 @DELETE
	 @Path("{nmcuenta}")
	 @Transactional
	 public Response delete(@PathParam Long nmcuenta) {
	        Cuenta entity = CuentaDAO.findById(nmcuenta);
	        if (entity == null) {
	            throw new WebApplicationException("No hay nuemro de cuenta " + nmcuenta + " no existe.", 404);
	        }
	        CuentaDAO.delete(entity);
	        return Response.status(204).build();
                                               }











}
