package com.bootcamp.quarkus;
import java.util.List;
//import com.bootcamp.quarkus.model.Pelicula;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;


@Path("/film")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class PeliculaResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.bootcamp.quarkus.Pelicula> getAll(){
          return  com.bootcamp.quarkus.Pelicula.findAll().list();
    }

    @POST
    @Transactional
    public Response persistArtist(com.bootcamp.quarkus.Pelicula pelicula, @Context UriInfo uriInfo) {
        com.bootcamp.quarkus.Pelicula.persist(pelicula);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(pelicula.id));
        return Response.created(builder.build()).build();
    }

}
