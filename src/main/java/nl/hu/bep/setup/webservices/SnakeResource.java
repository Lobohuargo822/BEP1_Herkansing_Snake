package nl.hu.bep.setup.webservices;

import nl.hu.bep.setup.model.GameInfo;
import nl.hu.bep.setup.webservices.requests.GameRequest;
import nl.hu.bep.setup.webservices.responses.MoveResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/snake")
public class SnakeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGameInfo() {
        GameInfo info = new GameInfo();
        return Response.ok(info).build();
    }

    @POST
    @Path("/start")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response startGame() {
        return Response.ok().build();
    }

    @POST
    @Path("/move")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response moveSnake(GameRequest request) {

        System.out.println(request.getTurn());
        System.out.println(request.getYou().get("health"));

        MoveResponse response = new MoveResponse("south", "Going up!!!!");
        return Response.ok(response).build();
    }

    @POST
    @Path("/stop")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response stopGame(){
        return Response.ok().build();
    }
}
