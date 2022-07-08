package nl.hu.bep.setup.webservices;

import nl.hu.bep.setup.model.GameInfo;
import nl.hu.bep.setup.webservices.requests.GameRequest;
import nl.hu.bep.setup.webservices.requests.You;
import nl.hu.bep.setup.webservices.responses.MoveResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

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

        MoveResponse move = new MoveResponse();
        You you = (You) new GameRequest().getYou();

        System.out.println(request.getTurn());
        System.out.println(request.getYou().get("health"));

        you.avoidMyNeck(you.getHead(), you.getBody(), move.getPossibleMoves() );
        you.avoidBorder(you.getHead(), move.getPossibleMoves(), request.getBoard());
        you.avoidBody(you.getHead(), you.getBody(), move.getPossibleMoves() );
        int choice = new Random().nextInt(move.getPossibleMoves().size());

        String Move = move.getPossibleMoves().get(choice);
        System.out.println(Move);

        System.out.println("Testing");

        move.setMove(Move);
        return Response.ok(move).build();
    }
//

    @POST
    @Path("/stop")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response stopGame(){
        return Response.ok().build();
    }
}
