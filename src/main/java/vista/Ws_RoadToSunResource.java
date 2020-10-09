/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.mongodb.Mongo;
import control.Road_To_Sun;
import javax.websocket.server.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author equipo
 */
@Path("ws_RoadToSun")
public class Ws_RoadToSunResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Ws_RoadToSunResource
     */
    public Ws_RoadToSunResource() {
    }

   @GET
   @Path("consultarClientes")
   @Produces({"application/json"})
   public String consultarClientes(){
       Road_To_Sun miRTS= new Road_To_Sun();
       return miRTS.consultarCientes();
   }
   
 //@GET
//@Path("consultarUsuario/idUsuario/{idUsuario}/nombre/{nombre}")
//@Produces({"application/json"})
//public String consultarUsuario(@PathParam("idUsuario ") String idUsuario,
//@PathParam("nombre ") String nombre){
//Mongo myMongo = new Mongo();
//return myMongo.consultarUsuario(idUsuario, nombre);
   
   
}

