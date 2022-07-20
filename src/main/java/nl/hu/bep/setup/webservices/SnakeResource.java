package nl.hu.bep.setup.webservices;

import nl.hu.bep.setup.model.GameInfo;
import nl.hu.bep.setup.webservices.requests.GameRequest;
import nl.hu.bep.setup.webservices.requests.You;
import nl.hu.bep.setup.webservices.responses.MoveResponse;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

//    @POST
//    @Path("/move")
////    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response moveSnake(GameRequest request) {
//        System.out.println(request);
//
////        ArrayList<String> possibleMoves = new ArrayList<>(Arrays.asList("up", "down", "left", "right"));
////
////        You you = request.getYou();
////
////        you.avoidMyNeck(you.getHead(), you.getBody(), possibleMoves );
////        you.avoidBorder(you.getHead(), possibleMoves, request.getBoard());
////        you.avoidBody(you.getHead(), you.getBody(), possibleMoves );
////        int choice = new Random().nextInt(possibleMoves.size());
////
////        String Move = possibleMoves.get(choice);
//        MoveResponse move = new MoveResponse("down");
//
////        move.setMove(Move
//
//        return Response.ok(move).build();
//    }

    @POST
    @Path("/move")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Response moveSnake(GameRequest request){
        MoveResponse response = new MoveResponse("left");
        return Response.ok(response).build();
    }



    @POST
    @Path("/end")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response stopGame(){
        return Response.ok().build();
    }
}
