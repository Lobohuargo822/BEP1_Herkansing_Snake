package nl.hu.bep.setup.webservices;

import nl.hu.bep.setup.model.GameInfo;
import nl.hu.bep.setup.webservices.responses.MoveResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/snake")
public class SnakeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGameInfor(){

        GameInfo info = new GameInfo();
        info.setColor("white");
        return Response.ok(info).build();
    }

    @POST
    @Path("/start")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response startGame(/* GameRequest request*/){
        return Response.ok().build();
    }

    @POST
    @Path("/stop")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response stopGame(){
        return Response.ok().build();
    }

    @POST
    @Path("/move")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response moveSnake(){
        MoveResponse response = new MoveResponse("up", "Move up!");
        return Response.ok(response).build();
    }
}
